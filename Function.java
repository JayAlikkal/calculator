

		import edu.princeton.cs.algs4.Queue;
		import edu.princeton.cs.algs4.TrieST;
		import java.util.ArrayList;

		public class Trie {
		TrieST<Integer> trie = new TrieST();

		public Integer getValue(String key) {
		return (Integer)this.trie.get(key);
		}

		public void setValue(String key, Integer value) {
		this.trie.put(key, value);
		}

		public ArrayList<String> getKeysWithPrefix(String prefix) {
		Queue<String> keysWithPrefix =   
		(Queue<String>)this.trie.keysWithPrefix(prefix);
		ArrayList<String> keysWithPrefixArray = new ArrayList<>();
		for (String key : keysWithPrefix) keysWithPrefixArray.add(key);
		return keysWithPrefixArray;
		}
		}


		package edu.princeton.cs.algs4;

		import java.util.Iterator;
		import java.util.NoSuchElementException;

		public class Queue<Item> implements Iterable<Item> {
		private static class Node<Item> {
		private Item item;
		  
		private Node<Item> next;
		}
		  
		private Node<Item> first = null;
		  
		private Node<Item> last = null;
		  
		private int n = 0;
		  
		public boolean isEmpty() {
		return (this.first == null);
		}
		  
		public int size() {
		return this.n;
		}
		  
		public Item peek() {
		if (isEmpty())
		throw new NoSuchElementException("Queue underflow");
		return this.first.item;
		}
		  
		public void enqueue(Item item) {
		Node<Item> oldlast = this.last;
		this.last = new Node<>();
		this.last.item = item;
		this.last.next = null;
		if (isEmpty()) {
		this.first = this.last;
		} else {
		oldlast.next = this.last;
		}
		this.n++;
		}
		  
		public Item dequeue() {
		if (isEmpty())
		throw new NoSuchElementException("Queue underflow");
		Item item = this.first.item;
		this.first = this.first.next;
		this.n--;
		if (isEmpty())
		this.last = null;
		return item;
		}
		public String toString() {
		StringBuilder s = new StringBuilder();
		for (Item item : this) {
		s.append(item);
		s.append(' ');
		}
		return s.toString();
		}
		  
		public Iterator<Item> iterator() {
		return new LinkedIterator(this.first);
		}
		  
		private class LinkedIterator implements Iterator<Item> {
		private Queue.Node<Item> current;
		  
		public LinkedIterator(Queue.Node<Item> first) {
		this.current = first;
		}
		  
		public boolean hasNext() {
		return (this.current != null);
		}
		  
		public void remove() {
		throw new UnsupportedOperationException();
		}
		  
		public Item next() {
		if (!hasNext())
		throw new NoSuchElementException();
		Item item = this.current.item;
		this.current = this.current.next;
		return item;
		
		public static String autoCompleteWord(File document, String prefix)()
		{
			this.documnet = documnet;
			this.prefix = prefix;
			
			
		}
		

		
		
