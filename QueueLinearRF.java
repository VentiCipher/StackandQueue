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
    private int front, rear;
    private int nItems;

    public QueueLinearRF()
    {
        this(100);
    }

    private boolean isFull()
    {
        System.out.println(rear + 1 == queue.length);
        return ((rear + 1 == queue.length));
    }

    public QueueLinearRF(int size)
    {
        queue = new Object[size];
        front = 0;
        rear = -1;
    }

    private void shift(int k)
    {
        for (int s = k; s >= 1; s--)
        {
            for (int i = 0; i < size(); i++)
                queue[i] = queue[i + 1];
            rear--;
        }
    }

    public void insert(Object init)
    {
        // System.out.println("rear = " + rear);

        if (isFull())
            // System.out.println("rear +1  = "+(rear+1));
            if (front != 0)
                shift(front);
            else
                throw new QueueFullException(("Full"));
        queue[++rear] = init;
        nItems++;
        //System.out.println("object " + init + " rear is " + rear + " n items is " + nItems + " front is " + front);
    }

    @Override
    public Object remove()
    {
        if (isEmpty())
            throw new QueueEmptyException("Empty queue");
        Object tmp = queue[front];
        front++;
        nItems--;
        return tmp;
    }

    public void display()
    {
        for (int i = 0; i < queue.length; i++)
            System.out.print(queue[i] + " ");
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
