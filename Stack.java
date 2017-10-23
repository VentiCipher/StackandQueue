/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author proms
 */
public class Stack implements StackADT
{

    private int nItems;
    private int top;
    private Object OStack[];

    public Stack()
    {
        this(100);
    }

    public Stack(int size)
    {
        OStack = new Object[size];
        top = -1;
        nItems = 0;
    }

    private boolean isFull()
    {
        if (nItems == OStack.length)
            return true;
        return false;
    }

    public boolean isEmpty()
    {
        if (top == -1)
            return true;
        return false;
    }

    public Object pop()
    {
        if (isEmpty())
            throw new StackEmptyException("Stack Empty");
        nItems--;
        return OStack[top--];
    }

    public Object top()
    {
        if (isEmpty())
            throw new StackEmptyException("Stack Empty");
        return OStack[top];
    }

    public int size()
    {
        return nItems;
    }

    public void push(Object init)
    {
        if (isFull())
        {
            Object[] tmp = new Object[nItems * 2];
            System.arraycopy(OStack, 0, tmp, 0, OStack.length);
            OStack = tmp;
        }
        nItems++;
        OStack[++top] = init;
    }

    private int intValue(Object pos)
    {
        return Integer.parseInt(pos.toString());
    }

    public static Stack merge(Stack A, Stack B)
    {
        Stack tmp = new Stack(A.size() + B.size());
        for (int k = 0; k < A.size() + B.size(); k++)
            if (A.isEmpty())
                tmp.push(B.pop());
            else if (B.isEmpty())
                tmp.push(A.pop());
            else if (A.top() instanceof Integer && B.top() instanceof Integer)
                if (A.intValue(A.top()) > B.intValue(B.top()))
                    tmp.push(A.pop());
                else
                    tmp.push(B.pop());

        return tmp;
    }

    public void display()
    {
        if (this.top() instanceof Integer)
            for (int i = nItems - 1; i >= 0; i--)
                System.out.println(Integer.parseInt(((Integer) OStack[i]).toString()));
        else 
            for (int i = nItems - 1; i >= 0; i--)
                System.out.println(OStack[i]);
    }

    public Object[] multiPop(int k)    throws StackEmptyException, IllegalArgumentException
    {
        if(k < 0)
            throw new IllegalArgumentException("Negative Pop size");
        Object[] tmp = new Object[k];
        for(int  h = 0 ; h < k ; h++)
        {
            if(isEmpty())
                throw new StackEmptyException("Stack Empty");
            else
                tmp[h] = pop();
        }
        return tmp;
    }

}
