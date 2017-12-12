package com.howtodoinjava.demo.editors;

import java.beans.PropertyEditorSupport;

import com.howtodoinjava.demo.model.DepartmentEntity;

public class DepartmentEditor extends PropertyEditorSupport 
{
    @Override
    public void setAsText(String id) 
    {
    	System.out.println(" setAsText " + id);
    	DepartmentEntity d;
    	switch(Integer.parseInt(id))
		{
			case 1: d = new DepartmentEntity(100,  "English"); break;
			case 2: d = new DepartmentEntity(200,  "Marathi"); break;
			case 3: d = new DepartmentEntity(300,  "Maths"); break;
			default: d = null;
		}
        this.setValue(d);
    }
}
