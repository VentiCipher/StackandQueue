/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author proms
 */
public class DoubleStack implements DoubleStackADT
{
    private Object Stack[];
    private int nItemsA;
    private int nItemsB;
    private int topA;
    private int topB;

    public DoubleStack (int size)
    {

        Stack = new Object[size];
        nItemsA = nItemsB = 0;
        topA = -1;
        topB = size;
    }
    
    public DoubleStack ()
    {
        this (100);
    }
    
    public int sizeA()
    {
        return nItemsA;
    }
    public int sizeB()
    {
        return nItemsB;
    }
    
    public boolean isEmptyA()
    {
        if(sizeA() == 0)
            return true;
        return false;        
    }
    
    public boolean isEmptyB()
    {
        if(sizeB() == Stack.length)
            return true;
        return false;        
    }
    
    private boolean isFull()
    {
        if((topA < Stack.length && (topA+1 != topB)) && (topB > 0 && (topB+1 != topA)))
            return true;
        return false;
    }
    
    public void pushA(Object initA)
    {
        if (isFull())
            throw new DoubleStackFullException("Stack Full");
        Stack[++topA] = initA;
    }
    
    public void pushB(Object initB)
    {
        if (isFull())
            throw new DoubleStackFullException("Stack Full");
        Stack[--topB] = initB;
    }
    
    public Object popA()
    {
        if(isEmptyA())
            throw new DoubleStackEmptyException("Stack A Empty");
        return Stack[topA--];
    }
    
    public Object popB()
    {
        if(isEmptyA())
            throw new DoubleStackEmptyException("Stack B Empty");
        return Stack[topB++];
    }
    
    public Object topA()
    {
        if(isEmptyA())
            throw new DoubleStackEmptyException("Stack A Empty");
        return Stack[topA];
    }
    
    public Object topB()
    {
        if(isEmptyB())
            throw new DoubleStackEmptyException("Stack B Empty");
        return Stack[topB];
    }
}
