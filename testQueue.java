/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author proms
 */
public class testQueue
{
    public static void main(String[] args)
    {
        QueueLinearRF QL = new QueueLinearRF(6);
        QL.insert(new Integer(2));
        QL.insert(new Integer(3));
        QL.insert(new Integer(4));
        QL.insert(new Integer(5));
        QL.insert(new Integer(7));
        QL.insert(new Integer(8));
        System.out.println("-");
        QL.display();
        System.out.println("");
        QL.remove();
        QL.insert(new Integer(19));
        QL.display();
        
    }
}
