package br.com.mariojp.solid.srp;
import java.util.List;
public class ReceiptService {
	private   TaxCalculador taxCalculador;
    private  ReceiptFormatter receiptFormatter;


    public ReceiptService(TaxCalculador taxCalculador,ReceiptFormatter receiptFomatter){
		this.taxCalculador=taxCalculador;
        this.receiptFormatter=receiptFomatter;
	}
	public String generateReceipt(Order order){
		List<Item> itens =order.getItems();
		double subtotal=itens.stream().mapToDouble(item -> item.getUnitPrice()* item.getQuantity()).sum();
		double tax= taxCalculador.calculartax(subtotal);
		double total= subtotal+tax;
		return receiptFormatter.formatReceipt(itens,subtotal,tax,total);
	}
	}

