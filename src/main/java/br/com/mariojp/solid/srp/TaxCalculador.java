package br.com.mariojp.solid.srp;

public class TaxCalculador {
private double TaxaRate = 0;
 

public TaxCalculador(){
    String property = System.getProperty(TaxaRate, 0.1);
    this TaxaRate = Double.parseDouble(property);
}
public double calculartax(double amount){
    return amount*TaxaRate;
}
public double getTaxaRate(){
    return TaxaRate;
}
}