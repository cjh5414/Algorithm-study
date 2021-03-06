package MinHeap;

class Tester {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();

        minHeap.insert(5);
        minHeap.insert(2);
        minHeap.insert(3);
        minHeap.insert(1);
        minHeap.insert(8);
        minHeap.insert(3);
        minHeap.insert(6);
        minHeap.insert(4);

        minHeap.print();

        System.out.println("Delete : " + minHeap.delete());
        minHeap.print();

        System.out.println("Delete : " + minHeap.delete());
        minHeap.print();
    }
}
