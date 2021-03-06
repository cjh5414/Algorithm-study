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
        int minVal = heap[1];
        int tmpIdx = 1, minIdx;
        int val = heap[(idx--)-1];

        while (tmpIdx * 2 < idx) {
            if (tmpIdx * 2 == idx - 1)
                minIdx = tmpIdx * 2;
            else
                minIdx = heap[tmpIdx * 2] < heap[tmpIdx * 2 + 1] ? tmpIdx * 2 : tmpIdx * 2 + 1;

            if (val > heap[minIdx]) {
                heap[tmpIdx] = heap[minIdx];
                tmpIdx = minIdx;
            }

            else break;
        }

        heap[tmpIdx] = val;

        return minVal;
    }


    public void print() {
        for (int i=1; i<idx; i++) {
            System.out.print(heap[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
