import java.util.ArrayList;

public class MyLinkedHashMap<K,V>{
	private final int numberOfBuckets;
	ArrayList<MyLinkedList<K>> myBuketArray;
	public MyLinkedHashMap() {
		this.numberOfBuckets=10;
		this.myBuketArray=new ArrayList<MyLinkedList<K>>(numberOfBuckets);
		for(int i=0;i<numberOfBuckets;i++) {
			this.myBuketArray.add(null);
		}
	}
	public int getBucketIndex(K key) {
		int hashcode = Math.abs(key.hashCode());
		int index= hashcode%10;
//		System.out.println("key: "+key+" hashcode: "+hashcode+" index: "+index);
		return index;
	}
	public V get(K key) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.myBuketArray.get(index);
		if(myLinkedList == null) return null;
		Node<K, V> node = (Node<K, V>)myLinkedList.find(key);
		return(node ==null)?null:node.getValue();	
	}
	public void add(K key,V value) {
		int index= this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.myBuketArray.get(index);
		if(myLinkedList==null) {
			myLinkedList = new MyLinkedList<>();
			this.myBuketArray.set(index, myLinkedList);
		}
		Node<K, V> node = (Node<K, V>) myLinkedList.find(key);
		if(node ==null) {
			node = new Node<>(key, value);
			myLinkedList.append(node);
		}
		else
			node.setValue(value);
	}
	public void remove(K key) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.myBuketArray.get(index);
		if(myLinkedList==null) {
			System.out.println("no such value present");
			return;
		}
		myLinkedList.delete(key);
	}
	@Override
	 public String toString() {
		 return "MyHashMapNodes{"+myBuketArray+'}';
	 }

}
