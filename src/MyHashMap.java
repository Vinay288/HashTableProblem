
public class MyHashMap<K,V> {
MyLinkedList<K> myLinkedList;
 public MyHashMap() {
	this.myLinkedList = new MyLinkedList<>();
}
 public V get(K key) {
	 Node<K,V> node = (Node<K, V>) this.myLinkedList.find(key);
	 return (node==null)?null:node.getValue();
 }
 public void add(K key,V value) {
	 Node<K, V> node = (Node<K, V>) this.myLinkedList.find(key);
	 if(node == null) {
		 node = new Node<>(key,value);
		 this.myLinkedList.append(node);
	 }
	 else
		 node.setValue(value);
 }
 @Override
 public String toString() {
	 return "MyHashMapNodes{"+myLinkedList+'}';
 }
}
