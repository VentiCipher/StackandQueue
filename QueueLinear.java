/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author proms
 */
public class QueueLinear implements QueueADTLinear
{
    private Object[] queue;
    private int front,rear;
    private int nItems;
    public QueueLinear()
    {
        this(100);
    }
    
    private boolean isFull()
    {
        System.out.println("n  "+nItems);
        System.out.println("length "+queue.length);
        System.out.println(nItems >= queue.length);
        return nItems >= queue.length;
    }
    public QueueLinear (int size)
    {
        queue = new Object[size];
        front = 0;
        rear = -1;
    }
    
    public void insert(Object init) throws QueueFullException
    {
        if(isFull())
            throw new QueueFullException("Full Queue");
        nItems++;
        System.out.println("nitems ="+nItems);
        queue[++rear] = init;
    }
    
    public void display()
    {
        for(int i = 0 ; i < queue.length; i++)
            System.out.print(queue[i]+" ");
    }
    @Override
    public Object remove() throws QueueEmptyException
    {
        if(isEmpty())
            throw new QueueEmptyException("Empty queue");
        Object tmp = queue[front];
        for(int i = 1 ; i < nItems ; i++)
            queue[i-1] = queue[i];
        nItems--;
        return tmp;
    }

    @Override
    public int size()
    {
        return nItems;
    }

    @Override
    public boolean isEmpty()
    {
        return nItems == 0;
    }

    @Override
    public Object front()
    {
        return queue[front];
    }

}