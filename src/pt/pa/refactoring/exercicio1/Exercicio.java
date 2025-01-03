package pt.pa.refactoring.exercicio1;

public class Exercicio {
    public static void main(String[] args) {
        QueueWithLimit<Integer> q = new QueueWithLimit<>();

        System.out.println("Enqueuing...");
        for(int i=1; i<=15; i++) {
            System.out.print(i + " ");
            
            try {
                q.enqueue(i);
            } catch (QueueFullException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();

        //does it make sense to allow the following? Not really, so Refactor!
        //q.add(2, 3);

        System.out.println("At front of queue: " + q.front());

        System.out.println("Dequeuing all elements:");
        while(!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
    }
    /*
    public class QueueWithLimit<T> extends ArrayList<T> implements Queue<T> {

        @Override
        public void enqueue(T elem) throws QueueFullException, NullPointerException {
            if(elem == null) throw new NullPointerException("Null not allowed.");

            if(size() >= 10) throw new QueueFullException("Queue reached its limit (is full).");

            add(elem);
        }

        @Override
        public T dequeue() throws QueueEmptyException {
            if(isEmpty()) throw new QueueEmptyException();

            return remove(0);
        }

        @Override
        public T front() throws QueueEmptyException {
            if(isEmpty()) throw new QueueEmptyException();

            return get(0);
        }
    }*/
}
