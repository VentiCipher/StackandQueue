/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author proms
 */
public class QueueOp
{
    public static void main(String[] args)
    {
        QueueLinear mouth = new QueueLinear(6);
        mouth.insert(4);
        mouth.insert(7);
        mouth.insert(8);
        mouth.insert(4);
        mouth.insert(1);
        mouth.insert(2);
        mouth.display();
        System.out.println("");
        mouth.reverseQueue();
        mouth.display();
        System.out.println("");

        mouth.replaceQueue(4,9);
        mouth.display();
    }
   
}
