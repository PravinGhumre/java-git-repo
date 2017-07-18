package com.test.concepts.generices;

public class GenericesTest3 {

	public static void main(String[] args) {

		MyType<Integer> integerType = new MyType<Integer>(100);
		MyType<Double> doubleType = new MyType<Double>(100.50);

		System.out.println(" integerType =>> " + integerType.getType().intValue());
		System.out.println(" doubleType =>> " + doubleType.getType().doubleValue());

		MyMap<String, Integer> myMap = new MyMap<>("JUEE", 1514);
		System.out.println(" myMap Type Key =>> " + myMap.getKey());
		System.out.println(" myMap Type Value =>> " + myMap.getValue());

	}

}

class MyType<T> {

	private T type;

	public MyType(T type) {
		this.type = type;
	}

	public T getType() {

		return this.type;
	}

}

class MyMap<K, V> {

	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public MyMap(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public MyMap() {
		super();
	}
}
