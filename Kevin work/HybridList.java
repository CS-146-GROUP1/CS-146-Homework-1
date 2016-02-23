import java.util.*;

public class HybridList<T> implements Iterable<T>{
	private class Node{
		Node next;
		int numElements;
		ArrayList<T> elements;
	}

	private Node root;
	private int maxElements;
	private int totalElements;
	
	public HybridList(){
		this.maxElements = 5; //Default value
	}

	public HybridList(int maxElements){
		if(maxElements < 1) maxElements = 1;
		this.maxElements = maxElements;
	}
	/**
	 * Searches for the element in the list.
	 * @param  element the element which is to be added.
	 * @return returns the index of the element if found, -1 if not.
	 */
	public T search(T element){
		Node traverse = root;
		while(traverse != null){
			for(int i=0; i<traverse.numElements; i++){
				if(traverse.elements.get(i) == element)
					return traverse.elements.get(i);
			}
			traverse = traverse.next;
		}
		return null;
	}
	/**
	 * Adds an element to the list.
	 * @param  element the element which is to be added.
	 */
	public void add(T element){
		if(root == null){
			root = createNode();
			addToNode(root, element);
		}else{
			Node traverse = root;
			//This way, it will check whether the current node is FULL and if there is no next.
			//The method addToNode(Node node, T element) will properly handle both. It will
			//fill in the empty spaces.
			while(traverse.next != null && traverse.numElements >= maxElements){
				traverse = traverse.next;
			}
			//This is the case if it is full and there is no next node.
			if(!addToNode(traverse, element)){
				traverse.next = createNode();
				addToNode(traverse.next, element);
			}
		}
	}
	private boolean addToNode(Node node, T element){
		if(node.numElements < maxElements){
			node.elements.add(element);
			node.numElements++;
			totalElements++;
			return true;
		}
		return false;
	}
	private Node createNode(){
		Node r = new Node();
		r.elements = new ArrayList<T>();
		r.next = null;
		r.numElements = 0;
		return r;
	}
	/**
	 * Removes element from the list.
	 * @param  element the element that matches the one in the list.
	 */
	public void remove(T element){
		Node traverse = root;
		boolean foundElement = false;
		while(traverse != null && !foundElement){
			for(int i=0; i<traverse.numElements; i++){
				if(traverse.elements.get(i) == element){
					traverse.elements.remove(i);
					traverse.numElements--;
					totalElements--;
					return;
				}
			}
			traverse = traverse.next;
		}
	}
	public void sort(){
		//Ghetto as fuck sort
		Node traverse = root;
		ArrayList<T> elements = new ArrayList<>();
		while(traverse != null){
			
			for(int i=0; i<traverse.numElements; i++){
				elements.add(traverse.elements.get(i));
				
			}
			traverse = traverse.next;
		}
		totalElements = 0;
		//Clear linked list
		traverse = root;
		Node prev = root;
		while(traverse != null){
			prev = traverse;
			traverse = traverse.next;
			prev = null;
		}
		root = null;
		//Cheat way to get natural order comparator
		Collections.sort(elements, Collections.reverseOrder(Collections.reverseOrder()));
		for(int i=0; i<elements.size(); i++){
			add(elements.get(i));
		}
		
	}
	@Override
	public Iterator<T> iterator() {
		Iterator<T> it = new Iterator<T>(){
	         private int currentIndex = 0;
	         private Node currentNode = null;
	            @Override
	            public boolean hasNext() {
	            	
					return false;
	            }
	            @Override
	            public T next(){
	            	//Just next.
	            	return null;
	            }
	            @Override
	            public void remove() {
	            	//Removal, can mutate the hybridlist
	            }	
		};
		return it;
	}
	public int size(){
		return totalElements;
	}
	public T get(int index){
		if(index < totalElements){
			int inner = index % maxElements;
			int node = index / maxElements; //how far to traverse
			Node traverse = root;
			while(node != 0){
				node--;
				traverse = traverse.next;
			}
			return traverse.elements.get(inner);
		}
		return null;
	}
	//Testing
	public static void main(String[] args){
		HybridList<Integer> myHybridList = new HybridList<Integer>(5);
		myHybridList.add(5);
		myHybridList.add(6);
		myHybridList.add(3);
		myHybridList.add(10);
		myHybridList.add(2);
		myHybridList.add(8);
		myHybridList.add(7);
		myHybridList.add(4);
		myHybridList.add(1);
		
		//Test search!
		if(myHybridList.search(10) != null)
			System.out.println("Has found 10");
		if(myHybridList.search(11) == null)
			System.out.println("Did not find 11");
		
		//Test sort!
		System.out.println("Before sort");
		for(int i=0; i<myHybridList.size(); i++){
			System.out.print(myHybridList.get(i) + " ");
		}
		myHybridList.sort();
		
		System.out.println("After sort");
		for(int i=0; i<myHybridList.size(); i++){
			System.out.print(myHybridList.get(i) + " ");
		}
		
		System.out.println();
		//Test remove!
		myHybridList.remove(10);
		System.out.println("Removed 10");
		if(myHybridList.search(10) != null)
			System.out.println("Has found 10");
		System.out.println("After removal");
		for(int i=0; i<myHybridList.size(); i++){
			System.out.print(myHybridList.get(i) + " ");
		}
		
	}
}