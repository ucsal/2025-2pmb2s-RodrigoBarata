package br.com.mariojp.solid.srp;
import java.util.List;
public class ReceiptService {
	private final  TaxCalculador taxCalculador;
    private final ReceiptFomatter receiptFomatter;



    public ReceiptFomatter(TaxCalculador taxCalculador,ReceiptFomatter receiptFomatter){
		this.taxCalculador=taxCalculador;
        this.receiptFomatter=receiptFomatter;
	}
	public String generateReceipt(List<Double> items){
		double subtotal=items.stream().mapToDouble(Double:: doubleValue).sum();
		double tax= taxCalculador.calculartax(subtotal);
		double total= subtotal+tax;
		return receiptFomatter.format(subtotal, tax, total);
	}
	}

