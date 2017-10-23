/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author proms
 */
public class MysteryStack
{

    public static void main(String[] args)
    {
        int n = Integer.parseInt("50");
        Stack s = new Stack();
        while (n > 0)
        {
            s.push(new Integer(n % 2));
            n = n / 2;
        }
        while (!s.isEmpty())
            System.out.print(((Integer) s.pop()).intValue());
        System.out.println();
    }
}
