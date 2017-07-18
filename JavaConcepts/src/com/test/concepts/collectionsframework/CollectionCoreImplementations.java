package com.test.concepts.collectionsframework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ABC
 *
 */
@SuppressWarnings({ "rawtypes", "unused" })
public class CollectionCoreImplementations {

	public static void main(String[] args) {

		CollectionCoreImplementations cci = new CollectionCoreImplementations();

		System.out.println("List Impls Differences \n");
		cci.testListImpls();
		System.out.println("\n");

		System.out.println("Set Impls Differences \n");
		cci.testSetImpls();
		System.out.println("\n");

		System.out.println("Map Impls Differences \n");
		cci.testMapImpls();
		System.out.println("\n");

		System.out.println("Queue Impls Differences \n");
		cci.testQueueImpls();
		System.out.println("\n");

		System.out.println("Deque Impls Differences \n");
		cci.testDequeImpls();
		System.out.println("\n");

	}

	private void testDequeImpls() {

		Deque linkedList = new LinkedList<>();
		Deque arrayDeque = new ArrayDeque<>();
	}

	private void testQueueImpls() {

		Queue priorityQueue = new PriorityQueue<>();
		Queue linkedList = new LinkedList<>();
		Queue arrayDeque = new ArrayDeque<>();
	}

	private void testMapImpls() {

		Map hashMap = new HashMap<>();
		Map hashTable = new Hashtable<>();
		Map treeMap = new TreeMap<>();

		Map linkedHashMap = new LinkedHashMap<>();
		Map weakHashMap = new WeakHashMap<>();
		Map concurrentHashMap = new ConcurrentHashMap<>();

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		Vector<Integer> vector = new Vector<Integer>();

		// hashMap add
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {

			hashMap.put(i, i + 100);
		}
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("hashMap add:  " + duration);

		// hashTable add
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			hashTable.put(i, i + 100);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("hashTable add: " + duration);

		// treeMap add
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			treeMap.put(i, i + 100);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("treeMap add: " + duration);

		// linkedHashMap add
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			linkedHashMap.put(i, i + 100);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("linkedHashMap add:  " + duration);

		// weakHashMap add
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			weakHashMap.put(i, i + 100);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("weakHashMap add: " + duration);

		// concurrentHashMap add
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			concurrentHashMap.put(i, i + 100);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("concurrentHashMap add: " + duration);

		System.out.println("\n");

		// hashMap get
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			hashMap.get(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("hashMap get:  " + duration);

		// hashTable get
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			hashTable.get(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("hashTable get: " + duration);

		// treeMap get
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			treeMap.get(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("treeMap get: " + duration);

		// linkedHashMap get
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			linkedHashMap.get(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("linkedHashMap get:  " + duration);

		// weakHashMap get
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			weakHashMap.get(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("weakHashMap get: " + duration);

		// concurrentHashMap get
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			concurrentHashMap.get(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("concurrentHashMap get: " + duration);

		System.out.println("\n");

		// hashMap remove
		startTime = System.currentTimeMillis();

		for (int i = 9999; i >= 0; i--) {
			hashMap.remove(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("hashMap remove:  " + duration);

		// hashTable remove
		startTime = System.currentTimeMillis();

		for (int i = 9999; i >= 0; i--) {
			hashTable.remove(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("hashTable remove: " + duration);

		// treeMap remove
		startTime = System.currentTimeMillis();

		for (int i = 9999; i >= 0; i--) {
			treeMap.remove(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("treeMap remove: " + duration);

		// linkedHashMap remove
		startTime = System.currentTimeMillis();

		for (int i = 9999; i >= 0; i--) {
			linkedHashMap.remove(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("linkedHashMap remove:  " + duration);

		// weakHashMap remove
		startTime = System.currentTimeMillis();

		for (int i = 9999; i >= 0; i--) {
			weakHashMap.remove(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("weakHashMap remove: " + duration);

		// concurrentHashMap remove
		startTime = System.currentTimeMillis();

		for (int i = 9999; i >= 0; i--) {
			concurrentHashMap.remove(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("concurrentHashMap remove: " + duration);

	}

	private void testSetImpls() {

		Set hashSet = new HashSet<>();
		Set linkedhashSet = new LinkedHashSet<>();
		Set treeSet = new TreeSet<>();

		// HashSet add
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			hashSet.add(i);
		}
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("HashSet add:  " + duration);

		// LinkedhashSet add
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			linkedhashSet.add(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("LinkedhashSet add: " + duration);

		// TreeSet add
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			treeSet.add(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("TreeSet add: " + duration);
		
		System.out.println("\n");

		// HashSet get
		startTime = System.currentTimeMillis();

		for (Iterator iterator2 = hashSet.iterator(); iterator2.hasNext();) {
			Object object = (Object) iterator2.next();

		}

		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("HashSet get:  " + duration);

		// LinkedhashSet get
		startTime = System.currentTimeMillis();

		for (Iterator iterator2 = linkedhashSet.iterator(); iterator2.hasNext();) {
			Object object = (Object) iterator2.next();

		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("LinkedhashSet get: " + duration);

		// treeSet get
		startTime = System.currentTimeMillis();

		for (Iterator iterator2 = treeSet.iterator(); iterator2.hasNext();) {
			Object object = (Object) iterator2.next();

		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("treeSet get: " + duration);
		
		System.out.println("\n");

		// hashSet remove
		startTime = System.currentTimeMillis();

		for (int i = 9999; i >= 0; i--) {
			hashSet.remove(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("hashSet remove:  " + duration);

		// linkedhashSet remove
		startTime = System.currentTimeMillis();

		for (int i = 9999; i >= 0; i--) {
			linkedhashSet.remove(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("linkedhashSet remove: " + duration);

		// treeSet remove
		startTime = System.currentTimeMillis();

		for (int i = 9999; i >= 0; i--) {
			treeSet.remove(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("treeSet remove: " + duration);

	}

	private void testListImpls() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		Vector<Integer> vector = new Vector<Integer>();

		// ArrayList add
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			arrayList.add(i);
		}
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("ArrayList add:  " + duration);

		// LinkedList add
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			linkedList.add(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("LinkedList add: " + duration);

		// Vector add
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			vector.add(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("Vector add: " + duration);
		
		System.out.println("\n");

		// ArrayList get
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			arrayList.get(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("ArrayList get:  " + duration);

		// LinkedList get
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			linkedList.get(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("LinkedList get: " + duration);

		// Vector get
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			vector.get(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("Vector get: " + duration);
		
		System.out.println("\n");

		// ArrayList remove
		startTime = System.currentTimeMillis();

		for (int i = 9999; i >= 0; i--) {
			arrayList.remove(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("ArrayList remove:  " + duration);

		// LinkedList remove
		startTime = System.currentTimeMillis();

		for (int i = 9999; i >= 0; i--) {
			linkedList.remove(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("LinkedList remove: " + duration);

		// Vector remove
		startTime = System.currentTimeMillis();

		for (int i = 9999; i >= 0; i--) {
			vector.remove(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("Vector remove: " + duration);
	}

}
