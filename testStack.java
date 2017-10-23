/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author proms
 */
public class testStack
{
    public static void main(String[] args)
    {
        Stack A = new Stack(6);
        Stack B = new Stack(3);
        Integer tmp = 1;
        A.push(tmp=5);
        A.push(tmp=10);
        A.push(tmp=17);
        A.push(tmp = 31);
        A.push(tmp=50);
        A.push(tmp=96);
        
        B.push(tmp=24);
        B.push(tmp = 45);
        B.push(tmp=63);
        B.push(tmp=85);
        System.out.println("Stack A");
        A.display();
        System.out.println("Stack B");
        B.display();
        
        Stack C = Stack.merge(A, B);
        System.out.println("Stack C");
        C.display();
    }
}
