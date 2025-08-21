package br.com.mariojp.solid.srp;

import java.util.List;

public class ReceiptFormatter {
public String format(double subtotal, double tax, double total ){
    return String.format("Subtatal: %.2f%nTax: %.2f%Total  %.2f", subtotal,tax,total);
}

    String formatReceipt(List<Item> itens, double subtotal, double tax, double total) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
