package Heap;


public class MinHeap {

	private int[] Heap;
	private int size;
	private int maxCapacity;

	private int FRONT = 1;

	public MinHeap(int maxCapacity) {
		this.maxCapacity = maxCapacity;
		this.size = 0;

		Heap = new int[maxCapacity + 1];
		Heap[0] = Integer.MIN_VALUE;
	}

	public int parent(int pos) {
		return (pos / 2);
	}
	
	public int leftChild(int pos) {
		return (2*pos);
	}
	
	public int rightChild(int pos) {
		return (2*pos+1);
	}
	
	public void swap(int first, int second) {
		int temp = Heap[first];
		Heap[first] = Heap[second];
		Heap[second]= temp;
	}
	
	public void insert(int element) {
		if(size >= maxCapacity) {
			return;
		}
		
		Heap[++size] = element;
		int current = size;
		
		while(Heap[current] < Heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
	}
	
	public boolean isLeaf(int pos) {
		if(pos >= (size/2) && pos <= size) {
			return true;
		}
		
		return false;
	}
	
	public void minHeapify(int pos) {
		
		if(!isLeaf(pos)) {
			if(Heap[pos] > Heap[leftChild(pos)] || Heap[pos] > Heap[rightChild(pos)]) {
				
				if(Heap[leftChild(pos)] < Heap[rightChild(pos)]) {
					swap(leftChild(pos), pos);
					minHeapify(leftChild(pos));
				}else {
					swap(rightChild(pos), pos);
					minHeapify(rightChild(pos));
				}
			}
		}
	}
	
	public int remove() {
		
		int popped = Heap[FRONT];
		Heap[FRONT] = Heap[size--];
		minHeapify(FRONT);
		
		return popped;
		
	}
	
	public void print() {
		
		for(int i=1; i<=(size/2); i++) {
			System.out.println("Parent -> " + Heap[i]);
			System.out.println("Left Child -> " + Heap[leftChild(i)] + " Right Child -> " + Heap[rightChild(i)]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinHeap heap = new MinHeap(10);
		heap.insert(3);
		heap.insert(7);
		heap.insert(8);
		heap.insert(9);
		heap.insert(10);
		heap.insert(11);
		heap.insert(12);
		
		heap.print();

	}

}
