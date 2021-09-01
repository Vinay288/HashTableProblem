
public class NodeMain {

	public static void main(String[] args) {
		String sentence= "To be or not to be To be or not to be To be or not to be To be or not to be";
//		MyHashMap<String, Integer> myHashMap = new MyHashMap<String, Integer>();
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<String, Integer>();
		String [] words = sentence.toLowerCase().split(" ");
		for(String word:words) {
			Integer value = myLinkedHashMap.get(word);
			if(value==null) value=1;
			else value=value+1;
			myLinkedHashMap.add(word, value);
			
		}
		System.out.println("frequency of word to is "+myLinkedHashMap.get("to"));
		System.out.println(myLinkedHashMap);

	}

}
