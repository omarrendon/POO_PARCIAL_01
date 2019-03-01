/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

/**
 *
 * @author omarcr
 */
public class CarRental {
    private String arrendatario;
    private Integer codigoPostal;
    private Sizes tamanioDelAuto;
    private Double rentaDiaria;
    private Integer diasDeRenta;
    private Double rentaTotal;
    
    public CarRental(String a,Integer cp,Sizes t,Integer d){
        arrendatario=a;
        codigoPostal=cp;
        tamanioDelAuto=t;
        diasDeRenta=d;
        if(tamanioDelAuto!=null){
            switch(tamanioDelAuto){
                case ECONOMY:
                    rentaDiaria=29.99;
                break;
                case MIDSIZE:
                    rentaDiaria=38.99;
                break;
                case FULL_SIZE:
                    rentaDiaria=43.5;
                break;
            }
            rentaTotal=diasDeRenta*rentaDiaria;
        }
        
    }

    public String getArrendatario() {
        return arrendatario;
    }

    public void setArrendatario(String arrendatario) {
        this.arrendatario = arrendatario;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Sizes getTamanioDelAuto() {
        return tamanioDelAuto;
    }

    public void setTamanioDelAuto(Sizes tamanioDelAuto) {
        this.tamanioDelAuto = tamanioDelAuto;
    }

    public Double getRentaDiaria() {
        return rentaDiaria;
    }

    public void setRentaDiaria(Double rentaDiaria) {
        this.rentaDiaria = rentaDiaria;
    }

    public Integer getDiasDeRenta() {
        return diasDeRenta;
    }

    public void setDiasDeRenta(Integer diasDeRenta) {
        this.diasDeRenta = diasDeRenta;
    }

    public Double getRentaTotal() {
        return rentaTotal;
    }

    public void setRentaTotal(Double rentaTotal) {
        this.rentaTotal = rentaTotal;
    }
    
    public void display(){
        System.out.println("Arrendatario: "+arrendatario+"\nCodigo Postal: "+codigoPostal+"\nTamanio del auto: "+tamanioDelAuto+"\nRenta diaria: $"+rentaDiaria
        +"\nDias de renta: "+diasDeRenta+"\nRenta total: $"+rentaTotal);
    }
}
