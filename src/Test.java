public class Test {
    public static void main(String[] args) {
        Bill[] payments = new Bill[]{
                new CashPayment(12, new ProgressiveTaxType(), new TaxService()),
                new MandatoryPayment(13, new IncomeTaxType(), new TaxService())
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}