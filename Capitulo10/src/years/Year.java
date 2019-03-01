/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package years;

/**
 *
 * @author omarcr
 */
public class Year {
    private Integer dias;
    
    public Year(){
        dias=365;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }
    
    public Integer daysElapsed(Mes m, Integer d){
        int nMes=0,diasE=0;
        Mes[] meses={Mes.ENERO,Mes.FEBRERO,Mes.MARZO,Mes.ABRIL,Mes.MAYO,Mes.JUNIO,Mes.JULIO,Mes.AGOSTO,Mes.SEPTIEMBRE,Mes.OCTUBRE,Mes.NOVIEMBRE,Mes.DICIEMBRE};
        for(int i=0;i<12;i++){
            if(m==meses[i])
                nMes=i;
        }
        for(int i=0;i<nMes;i++){
            if(meses[i]==Mes.ENERO || meses[i]==Mes.MARZO || meses[i]==Mes.MAYO || meses[i]==Mes.JULIO || meses[i]==Mes.AGOSTO || meses[i]==Mes.OCTUBRE || meses[i]==Mes.DICIEMBRE){
                diasE+=31;
            }
            if(meses[i]==Mes.ABRIL || meses[i]==Mes.JUNIO || meses[i]==Mes.SEPTIEMBRE || meses[i]==Mes.NOVIEMBRE){
                diasE+=30;
            }
            if(meses[i]==Mes.FEBRERO){
                diasE+=28;
            }
        }
        return diasE+d;
    }
}
