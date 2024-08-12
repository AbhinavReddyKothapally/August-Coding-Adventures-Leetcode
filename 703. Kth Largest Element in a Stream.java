class KthLargest {
    private int k;
    private PriorityQueue<Integer> heap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue<>(k);
        for (int num : nums) {
            if (heap.size() < k) {
                heap.offer(num);
            } else if (num > heap.peek()) {
                heap.offer(num);
                if (heap.size() > k) {
                    heap.poll();
                }
            }
        }
    }

    public int add(int val) {
        if (heap.size() < k) {
            heap.offer(val);
        } else if (val > heap.peek()) {
            heap.offer(val);
            heap.poll();
        }
        return heap.peek();
    }
}
