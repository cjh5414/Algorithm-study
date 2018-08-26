package MinHeap;

class MinHeap {
    int idx = 1;
    int[] heap = new int[256];

    public void insert(int val) {
        int tmpIdx = idx;
        heap[idx] = val;

        while (tmpIdx != 1 && heap[tmpIdx] < heap[tmpIdx / 2]) {
            int tmp = heap[tmpIdx];
            heap[tmpIdx] = heap[tmpIdx / 2];
            heap[tmpIdx / 2] = tmp;
            tmpIdx = tmpIdx / 2;
        }
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
