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
        int val = heap[1];
        int tmpIdx = 1, minIdx;

        heap[1] = heap[idx-1];

        while (tmpIdx * 2 + 1 < idx) {
            if (tmpIdx * 2 + 1 == idx)
                minIdx = tmpIdx * 2;
            else
                minIdx = heap[tmpIdx * 2] < heap[tmpIdx * 2 + 1] ? tmpIdx * 2 : tmpIdx * 2 + 1;

            if (heap[minIdx] < heap[tmpIdx]) {
                int tmp = heap[tmpIdx];
                heap[tmpIdx] = heap[minIdx];
                heap[minIdx] = tmp;
                tmpIdx = minIdx;
            }

            else break;
        }

        idx--;

        return val;
    }


    public void print() {
        for (int i=1; i<idx; i++) {
            System.out.print(heap[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
