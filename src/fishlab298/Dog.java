/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fishlab298;

/**
 *
 * @author Gfishj298
 */
public abstract class Dog  extends Animal{
    int weight = 19;

    public Dog(int weight, int age) {
                super(age);

        this.weight = weight;
    }
    
}
