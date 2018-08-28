package MinHeap;

class MinHeap {
    int idx = 1;
    int[] heap = new int[256];

    public void insert(int val) {
        int tmpIdx = idx;

        while (tmpIdx != 1 && val < heap[tmpIdx / 2]) {
            heap[tmpIdx] = heap[tmpIdx / 2];
            tmpIdx = tmpIdx / 2;
        }

        heap[tmpIdx] = val;
        idx++;
    }

    public int delete() {
        return 0;
    }


    public void print() {
        for (int i=1; i<idx; i++) {
            System.out.print(heap[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
