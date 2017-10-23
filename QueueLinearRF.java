/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author proms
 */
public class QueueLinearRF implements QueueADTLinear
{
    private Object[] queue;
    private int front,rear;
    private int nItems;
    public QueueLinearRF()
    {
        this(100);
    }
    
    private boolean isFull()
    {
        return nItems == queue.length;
    }
    public QueueLinearRF (int size)
    {
        queue = new Object[size];
        front = 0;
        rear = -1;
    }
    
    public void insert(Object init)
    {
        if(isFull())
            throw new QueueFullException("Full Queue");
        if(nItems == queue.length)
            while(front!=0)
            {
                queue[front-1] = queue[front];
            }
        queue[++rear] = init;
    }
    

    @Override
    public Object remove()
    {
        if(isEmpty())
            throw new QueueEmptyException("Empty queue");
        Object tmp = queue[front];
        front++;
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