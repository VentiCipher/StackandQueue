/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author proms
 */
public interface DoubleStackADT
{
    public void pushA(Object initA);
    public void pushB(Object initB);
    public Object popA() throws DoubleStackEmptyException;
    public Object popB()throws DoubleStackEmptyException;
    public boolean isEmptyA();
    public boolean isEmptyB();
    public Object topA()throws DoubleStackEmptyException;
    public Object topB()throws DoubleStackEmptyException;
    public int sizeA();
    public int sizeB();
}
