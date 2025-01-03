package pt.pa.refactoring.exercicio1;

import pt.pa.refactoring.exercicio1.Queue;
import pt.pa.refactoring.exercicio1.QueueEmptyException;
import pt.pa.refactoring.exercicio1.QueueFullException;

import java.util.ArrayList;

public class QueueWithLimit<T> implements Queue<T> {
    private static final int LIMIT = 10;
    private ArrayList<T> queue;

    public QueueWithLimit(){
        queue = new ArrayList<>();
    }

    @Override
    public void enqueue(T elem) throws QueueFullException, NullPointerException {
        if(elem == null) throw new NullPointerException("Null not allowed.");

        if(size() >= LIMIT) throw new QueueFullException("Queue reached its limit (is full).");

        queue.add(elem);
    }

    @Override
    public T dequeue() throws QueueEmptyException {
        if(queue.isEmpty()) throw new QueueEmptyException();

        return queue.remove(0);
    }

    @Override
    public T front() throws QueueEmptyException {
        if(isEmpty()) throw new QueueEmptyException();

        return queue.get(0);
    }
    @Override
    public int size(){
        return queue.size();
    }
    @Override
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    @Override
    public void clear(){
        queue.clear();
    }
}
