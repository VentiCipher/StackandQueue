/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author proms
 */
public interface QueueADTRF
{
    public void insert(Object init);
    public Object remove ();
    public int size();
    public boolean isEmpty();
    public Object front();
}
