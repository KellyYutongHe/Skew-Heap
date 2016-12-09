/* Author: Yutong He
 * Course: CSC 172
 * Lab Session: MW 1525-1640
 * Lab Assignment: Extra Credit Project
 * Date: April. 12th, 2016
 * Reference: http://www.sanfoundry.com/java-program-implement-skew-heap/
 */

public class Test {

	public static void main(String[] args) {
		System.out.println("Heap1: ");
		MySkewHeap<Integer> heap1 = new MySkewHeap<Integer>();
		System.out.println("Is the heap1 empty? " + heap1.isEmpty());
		System.out.println("The size of heap1 is " + heap1.getSize());
		System.out.println("Delete min: " + heap1.deleteMin());
		heap1.insert(9);
		heap1.insert(3);
		heap1.insert(5);
		heap1.insert(2);
		heap1.insert(6);
		heap1.printPreOrder();
		heap1.printInOrder();
		heap1.printPostOrder();
		System.out.println("Is the heap1 empty? " + heap1.isEmpty());
		System.out.println("The size of heap1  is " + heap1.getSize());
		System.out.println("The min of heap1 is " + heap1.findMin());
		System.out.println("Delete min: " + heap1.deleteMin());
		System.out.println("Delete min: " + heap1.deleteMin());
		System.out.println("The min of heap1 is " + heap1.findMin());
		heap1.printPreOrder();
		heap1.printInOrder();
		heap1.printPostOrder();
		
		System.out.println("\n" + "Heap2: ");
		MySkewHeap<Integer> heap2 = new MySkewHeap<Integer>();
		heap2.insert(5);
		heap2.insert(7);
		heap2.insert(8);
		heap2.insert(2);
		heap2.insert(3);
		System.out.println("The size of heap2 is " + heap2.getSize());
		System.out.println("The min of heap1 is " + heap2.findMin());
		heap2.printPreOrder();
		heap2.printInOrder();
		heap2.printPostOrder();
		
		System.out.println("\n" + "Merging two heaps: ");
		MySkewHeap<Integer> heap = MySkewHeap.mergeTwoHeaps(heap1, heap2);
		heap.printPreOrder();
		heap.printInOrder();
		heap.printPostOrder();
		System.out.println("Is the heap empty? " + heap.isEmpty());
		System.out.println("The size of heap  is " + heap.getSize());
		System.out.println("The min of heap1 is " + heap.findMin());
		System.out.println("Delete min: " + heap.deleteMin());
		System.out.println("Delete min: " + heap.deleteMin());
		System.out.println("The min of heap1 is " + heap.findMin());
		heap.printPreOrder();
		heap.printInOrder();
		heap.printPostOrder();
		System.out.println("Is the heap empty? " + heap.isEmpty());
		System.out.println("The size of heap  is " + heap.getSize());
	}
}
