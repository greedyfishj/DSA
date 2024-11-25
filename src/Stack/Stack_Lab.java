/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;
import java.util.*;
/**
 *
 * @author Gfishj298
 */
public class Stack_Lab {
    public static void main(String[] args) {
        //declair and add
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty());
        stack.add("Marlin"); //4
        stack.add("Trout"); //3
        stack.add("Gold Fish"); //2
        stack.add("Tuna"); //1
        //Search
        System.out.println(stack.search("Marlin"));
        System.out.println(stack.search("Greedy Fishj"));
        //pop and peek
        String topFish = stack.pop();
        String peekFish = stack.peek();
        System.out.println(stack);
        System.out.println(topFish);
        System.out.println(peekFish);
        
        
    }
}
