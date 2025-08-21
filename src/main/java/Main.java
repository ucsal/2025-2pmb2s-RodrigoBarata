import br.com.mariojp.solid.srp.Item;
import br.com.mariojp.solid.srp.Order;
import br.com.mariojp.solid.srp.ReceiptFormatter;
import br.com.mariojp.solid.srp.ReceiptService;
import br.com.mariojp.solid.srp.TaxCalculador;

public class Main {
	
	public static void main(String[] args) {
		TaxCalculador taxCalculador= new TaxCalculador();
		ReceiptFormatter receiptFomatter= new ReceiptFormatter();
		ReceiptService receiptService=new ReceiptService(taxCalculador, receiptFomatter);
		Order o = new Order();
		o.add(new Item("Café", 8.0, 2)); // 16
		o.add(new Item("Bolo", 12.5, 1)); // 12.5 -> subtotal 28.5
		String receipt = receiptService.generateReceipt(o);
		System.out.println(receipt);
		
	}
}
