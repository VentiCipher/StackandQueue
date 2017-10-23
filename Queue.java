/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author proms
 */
public class Queue implements QueueADT
{
    private Object[] queue;
    private int front,rear;
    private int nItems;
    public Queue()
    {
        this(100);
    }
    
    private boolean isFull()
    {
        return nItems == queue.length;
    }
    public Queue (int size)
    {
        queue = new Object[size];
        front = 0;
        rear = -1;
    }
    
    public void insert(Object init)
    {
        if(isFull())
            throw new QueueFullException("Full Queue");
        queue[++rear] = init;
    }
    
    public 

}