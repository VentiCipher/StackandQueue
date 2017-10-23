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
    

    @Override
    public Object remove()
    {
        if(isEmpty())
            
    }

    @Override
    public int size()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object front()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}