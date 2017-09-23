/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deepak;

/**
 *
 * @author ultra
 */
class deep extends Deepak
        {
int deepak;
void patidar(){
    super.deepak();    System.out.println(""+deepak);
    System.out.println(super.deep);
}

    

    

    
}
public class Deepak {
    static int deep=10;
    public static void main(String[] args) {
        deep obj = new deep();
        obj.patidar();
    }

    void deepak() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    
}
