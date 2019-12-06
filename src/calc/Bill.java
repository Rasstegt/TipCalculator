package calc;

public class Bill {
	double total;
	double amount;
	
	public Bill() {
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double calcTip(double billAmt, double tipAmt) {
		if (tipAmt == 0) {
			total = billAmt;
		} else {
		total = billAmt * tipAmt;
		}
		return total;
	}
}
