/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facada;

/**
 *
 * @author hp
 */
public class FacadeHelper {
    
    MObile mObile;
   
    
    public void getiphone(){
        mObile=new Iphone();
        mObile.getsale();
        mObile.getsrialnumber();
    }
     public void getblacbare(){
        mObile=new Mlackbare();
        mObile.getsale();
        mObile.getsrialnumber();
    }
      public void getsamsung(){
        mObile=new Samsung();
        mObile.getsale();
        mObile.getsrialnumber();
    }
    
    
    
    
    
}
