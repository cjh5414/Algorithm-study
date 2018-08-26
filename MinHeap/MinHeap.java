package MinHeap;

class MinHeap {
    int idx = 1;
    int[] heap = new int[256];

    public void insert(int val) {
        int tmpIdx = this.idx;
        while (tmpIdx != 1 && heap[tmpIdx] < heap[tmpIdx / 2]) {
            tmpIdx = tmpIdx / 2;
        }

        heap[idx] = heap[tmpIdx];
        heap[tmpIdx] = val;
        idx++;
    }

    public int delete() {
        return 0;
    }


    public void print() {
        return;
    }
}
