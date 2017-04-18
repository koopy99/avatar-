/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package avatarcharactertester;

/**
 *
 * @author Jessa
 */
public class Human extends Character{
    int siblings;
    String birthNation;
    
    public Human(String n, String b, String s, String g, int sb, String bn){
        super(n, b, s, true, g);
        siblings = sb;
        birthNation = bn;
    }
    
}
