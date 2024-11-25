/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;
import java.util.*;
/**
 *
 * @author Gfishj298
 */
public class Queue_Lab {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("A fishj");
        queue.offer("B fishj");
        queue.offer("C fishj");
        queue.offer("D fishj");
        System.out.println(queue.remove());
        System.out.println(queue.poll());
    } 
}
