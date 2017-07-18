package com.test.concepts.collectionsframework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

@SuppressWarnings({ "rawtypes", "unused" })
public class CollectionInitCapacityAndResizing {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		List<Integer> vector = new Vector<>();

		Map hashMap = new HashMap<>();
		Map hashTable = new Hashtable<>();
		Map treeMap = new TreeMap<>();

		Map linkedHashMap = new LinkedHashMap<>();
		Map weakHashMap = new WeakHashMap<>();
		Map concurrentHashMap = new ConcurrentHashMap<>();

		Set hashSet = new HashSet<>();
		Set linkedhashSet = new LinkedHashSet<>();
		Set treeSet = new TreeSet<>();

		Queue priorityQueue = new PriorityQueue<>();
		Queue queueLinkedList = new LinkedList<>();
		Queue arrayDeque = new ArrayDeque<>();

	}

}
