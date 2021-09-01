

public class MyLinkedList<K>  {
K key;
INode head,tail;
public MyLinkedList() {
	this.head=null;
	this.tail=null;
}
public INode find(K key) {
	int index = 1;
	INode currentNode = head;
	while (currentNode != null) {
		if (currentNode.getKey().equals(key)) {
			return currentNode;
		}
		currentNode = currentNode.getNext();
		index++;
	}
	return null;
}
public void append(INode<K> newNode) {
	if (tail == null)
		this.tail = newNode;
	if (head == null)
		this.head = newNode;
	else
		tail.setNext(newNode);
	tail = newNode;
}

@Override
public String toString() {
	 return "MyHashMapNodes{"+head+'}';
}


}
