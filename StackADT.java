/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author proms
 */
public interface StackADT
{
    public void push(Object init);
    public Object pop()throws DoubleStackEmptyException;
    public boolean isEmpty();
    public Object top()throws DoubleStackEmptyException;
    public int size();
     public Object[] multiPop(int k)
            throws StackEmptyException, IllegalArgumentException;

}
