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
public class StringRev_wtStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char[] cs = st.toCharArray();
        Stack<Character> sta = new Stack<Character>();
        for(int i = 0; i< cs.length; i++){
            sta.push(cs[i]);
        }
        while(!sta.isEmpty()){
            System.out.print(sta.pop());
        }
        System.out.println("");
    }
}
