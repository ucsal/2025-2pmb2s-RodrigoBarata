package br.com.mariojp.solid.srp;

public class ReceiptFomatter {
public String format(double subtotal, double tax, double total ){
    return String.format("Subtatal: %.2f%nTax: %.2f%Total  %.2f", subtotal,tax,total);
}
}
