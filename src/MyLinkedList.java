
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
public void delete(K key) {
	INode currentNode = head,previousNode=null;
	if(currentNode.getKey().equals(key)) {
		head = head.getNext();
		currentNode= null;
		System.out.println("deleted");
		return;
	}
	while(currentNode!=null) {
		if(currentNode.getKey().equals(key)) {
			if(currentNode.getNext()==null) {
				previousNode.setNext(null);
			}
			else
			previousNode.setNext(currentNode.getNext());
			currentNode=null;
			System.out.println(key+" deleted");
			break;
		}
		previousNode=currentNode;
		currentNode=currentNode.getNext();
	}
}

@Override
public String toString() {
	 return "MyHashMapNodes{"+head+'}';
}


}
