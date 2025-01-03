package pt.pa.refactoring.exercicio1;

public class Main {

    public static void main(String[] args) {
        QueueWithLimit<Integer> q = new QueueWithLimit<>();
        enqueue(q, 15);
        System.out.println("At front of queue: " + q.front());
        dequeue(q);
    }

    private static void enqueue(QueueWithLimit<Integer> q, int limit) throws QueueFullException{
        System.out.println("Enqueuing...");
        for(int i=1; i<=limit; i++) {
            System.out.print(i + " ");
            if(i == 10){System.out.println();}
            try {
                q.enqueue(i);
            } catch (QueueFullException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
    }

    private static void dequeue(QueueWithLimit<Integer> q) {
        System.out.println("Dequeuing all elements:");
        while(!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
    }
}
