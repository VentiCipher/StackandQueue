/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author proms
 */
public class CheckPalindrome
{

    public static void main(String[] args) throws IllegalArgumentException
    {
/*        if (args[0] == null)
            throw new IllegalArgumentException("Error no argument to check");
        String inp = args[0];*/
        String inp = "madam";
        Stack palindrome = new Stack(inp.length());
        System.out.println("inp = "+inp.length());
        boolean isEven = inp.length() % 2 == 0;
        for (int idx = 0; idx < inp.length(); idx++)
        {
           
            if (!isEven)
            {
                if (idx == (inp.length()/2))
                    continue;
            }
            if ((!palindrome.isEmpty()) && ((char)palindrome.top() == inp.charAt(idx)))
            {
                palindrome.pop();
            }
            else
            {
               
                palindrome.push((char) inp.charAt(idx));
            }
        }
        if(!palindrome.isEmpty())
            palindrome.display();
      //  System.out.println("palindrome size = " + palindrome.size());
        if ((palindrome.size() > 1 && !isEven) || (palindrome.size() != 0 && isEven))
            System.out.println(inp + " is not a palindrome");
        else
            System.out.println(inp + " is a palindrome");
    }
}
