public class Bill {
    private double amount;
    private TaxType taxtype;
    private TaxService taxService;

    public Bill(double amount, TaxType taxtype, TaxService taxService) {
        this.amount = amount;
        this.taxtype = taxtype;
        this.taxService = taxService;
    }

    public void payTaxes() {
        double taxAmount = taxtype.calculateTaxFor(amount);
        taxService.payOut(taxAmount);
    }
}