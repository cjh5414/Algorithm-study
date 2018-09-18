import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PQExample {
    public static void main(String[] args) {
        PriorityQueue<Prisoner> priorityQueue = getPriorityQueueOfPrisoners();

        // 형량이 높은 순으로 범죄자 목록을 출력
        System.out.println("형량이 높은 순.");
        while (!priorityQueue.isEmpty())
            System.out.println(priorityQueue.poll());


        priorityQueue = getPriorityQueueOfPrisoners();

//        PriorityQueue<Prisoner> reversedPriorityQueue = new PriorityQueue<>(priorityQueue.size(), new Comparator<Prisoner>() {
//                @Override
//                public int compare(Prisoner p1, Prisoner p2) {
//                    return p1.weight >= p2.weight ? 1 : -1;
//                }
//        });

//        PriorityQueue<Prisoner> reversedPriorityQueue = new PriorityQueue<>(priorityQueue.size(),
//                (Prisoner p1, Prisoner p2) -> p1.weight >= p2.weight ? 1 : -1);

        PriorityQueue<Prisoner> reversedPriorityQueue = new PriorityQueue<>(priorityQueue.size(), Collections.reverseOrder(priorityQueue.comparator()));

        reversedPriorityQueue.addAll(priorityQueue);

        // 형량이 낮은 순으로 범죄자 목록을 출력
        System.out.println("\n형량이 낮은 순.");
        while (!reversedPriorityQueue.isEmpty())
            System.out.println(reversedPriorityQueue.poll());
    }

    static PriorityQueue<Prisoner> getPriorityQueueOfPrisoners() {
        PriorityQueue<Prisoner> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(new Prisoner("김철수", 20));
        priorityQueue.offer(new Prisoner("김영희", 100));
        priorityQueue.offer(new Prisoner("한택희", 66));
        priorityQueue.offer(new Prisoner("이나영", 7));
        priorityQueue.offer(new Prisoner("이혁", 43));
        priorityQueue.offer(new Prisoner("안영희", 100));

        return priorityQueue;
    }
}


class Prisoner implements Comparable<Prisoner> {
    String name;
    int weight;

    public Prisoner(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Prisoner target) {
        return this.weight <= target.weight ? 1 : - 1;
    }

    @Override
    public String toString() {
        return "이름 : " + name + ", 형량 : " + weight;
    }
}
