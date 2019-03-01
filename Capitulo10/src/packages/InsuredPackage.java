/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packages;

/**
 *
 * @author omarcr
 */
public class InsuredPackage extends Package{
    public InsuredPackage(Double p, MetodosDeEnvio m){
        super(p,m);
    }
    public void calculateCost(){
        super.calculateCost();
        if(getCostoDeEnvio()<=1)
            setCostoDeEnvio(getCostoDeEnvio()+2.45);
        if(getCostoDeEnvio()>=1.01 && getCostoDeEnvio()<=3)
            setCostoDeEnvio(getCostoDeEnvio()+3.95);
        if(getCostoDeEnvio()>=3.01)
            setCostoDeEnvio(getCostoDeEnvio()+5.55);
    }
}
