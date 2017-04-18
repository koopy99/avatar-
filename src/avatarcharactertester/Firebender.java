/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package avatarcharactertester;

/**
 *
 * @author Jessa
 */
public class Firebender extends Human{
    boolean canLightningbend; //does not include redirection... wait... how many 
                //lightningbenders are there, then?? not many :/ (then again, not many bloodbenders either....)
    boolean inRoyalFamily;
    
    public Firebender(String n, String s, String g, int sb, String bn, boolean l, boolean r){
        super(n, "fire", s, g, sb, bn);
        canLightningbend = l;
        inRoyalFamily = r;
    }
    
    public void sumting(){
        
    }
    
    public void shootFireball(){
        System.out.println(name+" shoots a fireball");
    }
    
    public void setOnFire(String o){
        System.out.println(name+" sets "+o+" on fire");
    }
    
}