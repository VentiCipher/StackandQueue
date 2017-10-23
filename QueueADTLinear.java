/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author proms
 */
public interface QueueADTLinear
{
    public void insert(Object init) throws QueueFullException;
    public Object remove ();
    public int size();
    public boolean isEmpty() throws QueueEmptyException;
    public Object front();
}
