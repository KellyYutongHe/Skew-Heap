/* Author: Yutong He
 * Course: CSC 172
 * Lab Session: MW 1525-1640
 * Lab Assignment: Extra Credit Project
 * Date: April. 12th, 2016
 * Reference: http://www.sanfoundry.com/java-program-implement-skew-heap/
 */

public class MySkewHeap <T extends Comparable<T>> {
	protected MySkewNode<T> root;
	protected int size;
	
	public MySkewHeap(){
		root = null;
		size = 0;
	}

	
	public MySkewNode<T> getRoot() {
		return root;
	}

	public void setRoot(MySkewNode<T> root) {
		this.root = root;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	public boolean isEmpty(){
		return root == null;
	}
	
	public MySkewNode<T> merge(MySkewNode<T> m, MySkewNode<T> n){
		if(m == null){
			return n;
		}else if(n == null){
			return m;
		}else{
			if(m.data.compareTo(n.data) <= 0){
				MySkewNode<T> temp = m.left;
				m.left = merge(m.right, n);
				m.right = temp;
				return m;
			}else{
				return merge(n, m);
			}
		}
	}
	
	public void insert(T element){
		MySkewNode<T> temp = new MySkewNode<T>(element);
		root = merge(temp, root);
		size++;
	}
	
	public T deleteMin(){
		if(root == null){
			return null;
		}
		T temp = root.data;
		root = merge(root.left, root.right);
		size--;
		return temp;
	}
	
	public void printPreOrder() {
		System.out.println("Printing PreOrder:");
		if(root != null){
			root.printPreOrder();
		}
	}

	public void printInOrder() {
		System.out.println("Printing InOrder:");
		if(root != null){
			root.printInOrder();
		}
	}

	public void printPostOrder() {
		System.out.println("Printing PostOrder:");
		if(root != null){
			root.printPostOrder();
		}
	}
	
	public static <T extends Comparable<T>> MySkewHeap<T> mergeTwoHeaps(MySkewHeap<T> h1, MySkewHeap<T> h2){
		MySkewHeap<T> heap = new MySkewHeap<T>();
		heap.setRoot(heap.merge(h1.root, h2.root));
		heap.setSize(h1.getSize() + h2.getSize());
		return heap;
	}
	
	public T findMin(){
		return root.data;
	}
}
