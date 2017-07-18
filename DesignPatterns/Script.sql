--<ScriptOptions statementTerminator=";"/>

CREATE TABLE "MDMDB"."PERSON" (
		"CONT_ID" NUMBER(19 , 0) NOT NULL,
		"MARITAL_ST_TP_CD" NUMBER(19 , 0),
		"BIRTHPLACE_TP_CD" NUMBER(19 , 0),
		"CITIZENSHIP_TP_CD" NUMBER(19 , 0),
		"HIGHEST_EDU_TP_CD" NUMBER(19 , 0),
		"AGE_VER_DOC_TP_CD" NUMBER(19 , 0),
		"GENDER_TP_CODE" CHAR(1),
		"BIRTH_DT" TIMESTAMP,
		"DECEASED_DT" TIMESTAMP,
		"CHILDREN_CT" NUMBER,
		"DISAB_START_DT" TIMESTAMP,
		"DISAB_END_DT" TIMESTAMP,
		"USER_IND" CHAR(1),
		"LAST_UPDATE_DT" TIMESTAMP DEFAULT 'LOCALTIMESTAMP' NOT NULL,
		"LAST_UPDATE_USER" VARCHAR2(20),
		"LAST_UPDATE_TX_ID" NUMBER(19 , 0)
	)
	LOGGING
	NOCOMPRESS;

CREATE INDEX "MDMDB"."I1_PERSON"
	ON "MDMDB"."PERSON"
	("CONT_ID"		ASC,
	  "BIRTH_DT"		ASC,
	  "GENDER_TP_CODE"		ASC)
	LOGGING;

CREATE UNIQUE INDEX "MDMDB"."P_PERSON"
	ON "MDMDB"."PERSON"
	("CONT_ID"		ASC)
	LOGGING;

ALTER TABLE "MDMDB"."PERSON" ADD CONSTRAINT "P_PERSON" PRIMARY KEY
	("CONT_ID") USING INDEX "MDMDB"."P_PERSON";

ALTER TABLE "MDMDB"."PERSON" ADD CONSTRAINT "SYS_C0016254" CHECK ("CONT_ID" IS NOT NULL);

ALTER TABLE "MDMDB"."PERSON" ADD CONSTRAINT "SYS_C0016255" CHECK ("LAST_UPDATE_DT" IS NOT NULL);

ALTER TABLE "MDMDB"."PERSON" ADD CONSTRAINT "F1_PERSO" FOREIGN KEY
	("CONT_ID")
	REFERENCES "MDMDB"."CONTACT"
	("CONT_ID");

CREATE TRIGGER "MDMDB"."D_PORSON" 
	AFTER DELETE ON "MDMDB"."PERSON"
	REFERENCING NEW AS NEW OLD AS OLD
	FOR EACH ROW
DECLARE new_last_update_dt timestamp;                                                                                                                                                                                                            BEGIN                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             select :OLD.last_update_dt - interval '00:00.000001' minute to second into new_last_update_dt from dual;                                                                                                                                                                                                                                                   UPDATE h_person SET h_end_dt = new_last_update_dt WHERE h_cont_id=:old.cont_id AND h_action_code='U' AND h_end_dt IS NULL ;                                                                                                 INSERT INTO h_person (                                                                                                                                                                                                                             h_cont_id                                                                                                                                                                                                                                      , h_action_code                                                                                                                                                                                                                                  , h_created_by                                                                                                                                                                                                                                   , h_create_dt                                                                                                                                                                                                                                    , h_end_dt                                                                                                                                                                                                                                       , cont_id                                                                                                                                                                                                                                        , marital_st_tp_cd                                                                                                                                                                                                                               , birthplace_tp_cd                                                                                                                                                                                                                               , citizenship_tp_cd                                                                                                                                                                                                                              , highest_edu_tp_cd                                                                                                                                                                                                                              , age_ver_doc_tp_cd                                                                                                                                                                                                                              , gender_tp_code                                                                                                                                                                                                                                 , birth_dt                                                                                                                                                                                                                                       , deceased_dt                                                                                                                                                                                                                                    , children_ct                                                                                                                                                                                                                                    , disab_start_dt                                                                                                                                                                                                                                 , disab_end_dt                                                                                                                                                                                                                                   , user_ind                                                                                                                                                                                                                                       , last_update_dt                                                                                                                                                                                                                                 , last_update_user                                                                                                                                                                                                                               , last_update_tx_id                                                                                                                                                                                                                              ) VALUES                                                                                                                                                                                                                                         ( :OLD.cont_id                                                                                                                                                                                                                                   , 'D'                                                                                                                                                                                                                                            , NVL(:OLD.last_update_user,'-')                                                                                                                                                                                                                                           , :OLD.last_update_dt                                                                                                                                                                                                                              , fn_date()                                                                                                                                                                                                                                           , :OLD.cont_id                                                                                                                                                                                                                                   , :OLD.marital_st_tp_cd                                                                                                                                                                                                                          , :OLD.birthplace_tp_cd                                                                                                                                                                                                                          , :OLD.citizenship_tp_cd                                                                                                                                                                                                                         , :OLD.highest_edu_tp_cd                                                                                                                                                                                                                         , :OLD.age_ver_doc_tp_cd                                                                                                                                                                                                                         , :OLD.gender_tp_code                                                                                                                                                                                                                            , :OLD.birth_dt                                                                                                                                                                                                                                  , :OLD.deceased_dt                                                                                                                                                                                                                               , :OLD.children_ct                                                                                                                                                                                                                               , :OLD.disab_start_dt                                                                                                                                                                                                                            , :OLD.disab_end_dt                                                                                                                                                                                                                              , :OLD.user_ind                                                                                                                                                                                                                                  , :OLD.last_update_dt                                                                                                                                                                                                                            , :OLD.last_update_user                                                                                                                                                                                                                          , :OLD.last_update_tx_id                                                                                                                                                                                                                         );                                                                                                                                                                                                                                               END;

CREATE TRIGGER "MDMDB"."U_PORSON" 
	AFTER UPDATE ON "MDMDB"."PERSON"
	REFERENCING NEW AS NEW OLD AS OLD
	FOR EACH ROW
DECLARE new_last_update_dt timestamp;                                                                                                                                                                                                            BEGIN                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             select :OLD.last_update_dt - interval '00:00.000001' minute to second into new_last_update_dt from dual;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    UPDATE h_person SET h_end_dt = new_last_update_dt WHERE h_cont_id=:OLD.cont_id AND h_action_code='U'  AND h_end_dt IS NULL ;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          INSERT INTO h_person (                                                                                                                                                                                                                             h_cont_id                                                                                                                                                                                                                                      , h_action_code                                                                                                                                                                                                                                  , h_created_by                                                                                                                                                                                                                                   , h_create_dt                                                                                                                                                                                                                                    , h_end_dt                                                                                                                                                                                                                                       , cont_id                                                                                                                                                                                                                                        , marital_st_tp_cd                                                                                                                                                                                                                               , birthplace_tp_cd                                                                                                                                                                                                                               , citizenship_tp_cd                                                                                                                                                                                                                              , highest_edu_tp_cd                                                                                                                                                                                                                              , age_ver_doc_tp_cd                                                                                                                                                                                                                              , gender_tp_code                                                                                                                                                                                                                                 , birth_dt                                                                                                                                                                                                                                       , deceased_dt                                                                                                                                                                                                                                    , children_ct                                                                                                                                                                                                                                    , disab_start_dt                                                                                                                                                                                                                                 , disab_end_dt                                                                                                                                                                                                                                   , user_ind                                                                                                                                                                                                                                       , last_update_dt                                                                                                                                                                                                                                 , last_update_user                                                                                                                                                                                                                               , last_update_tx_id                                                                                                                                                                                                                               ) VALUES                                                                                                                                                                                                                                        ( :OLD.cont_id                                                                                                                                                                                                                                   , 'U'                                                                                                                                                                                                                                            , NVL(:OLD.last_update_user,'-')                                                                                                                                                                                                                                           , :OLD.last_update_dt                                                                                                                                                                                                                             , NULL                                                                                                                                                                                                                            , :OLD.cont_id                                                                                                                                                                                                                                   , :OLD.marital_st_tp_cd                                                                                                                                                                                                                          , :OLD.birthplace_tp_cd                                                                                                                                                                                                                          , :OLD.citizenship_tp_cd                                                                                                                                                                                                                         , :OLD.highest_edu_tp_cd                                                                                                                                                                                                                         , :OLD.age_ver_doc_tp_cd                                                                                                                                                                                                                         , :OLD.gender_tp_code                                                                                                                                                                                                                            , :OLD.birth_dt                                                                                                                                                                                                                                  , :OLD.deceased_dt                                                                                                                                                                                                                               , :OLD.children_ct                                                                                                                                                                                                                               , :OLD.disab_start_dt                                                                                                                                                                                                                            , :OLD.disab_end_dt                                                                                                                                                                                                                              , :OLD.user_ind                                                                                                                                                                                                                                  , :OLD.last_update_dt                                                                                                                                                                                                                            , :OLD.last_update_user                                                                                                                                                                                                                          , :OLD.last_update_tx_id                                                                                                                                                                                                                         );                                                                                                                                                                                                                                               END;

