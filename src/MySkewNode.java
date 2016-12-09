/* Author: Yutong He
 * Course: CSC 172
 * Lab Session: MW 1525-1640
 * Lab Assignment: Extra Credit Project
 * Date: April. 12th, 2016
 * Reference: http://www.sanfoundry.com/java-program-implement-skew-heap/
 */

public class MySkewNode <T extends Comparable<T>> {
	public T data;
	public MySkewNode<T> left;
	public MySkewNode<T> right;
	
	public MySkewNode(T data, MySkewNode<T> left, MySkewNode<T> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public MySkewNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public MySkewNode(){
		
	}
	
	public void printPreOrder() {
		System.out.println(data);
		if (left != null){
			left.printPreOrder();
		}
		if (right != null){
			right.printPreOrder();
		}
	}
	
	public void printInOrder() {
		if (left != null){
			left.printInOrder();
		}
		System.out.println(data);
		if (right != null){
			right.printInOrder();
		}
	}
	
	public void printPostOrder() {
		if (left != null){
			left.printPostOrder();
		}
		if (right != null){
			right.printPostOrder();
		}
		System.out.println(data);
	}
}
