public class Commission extends Hourly {
    private double totalSales;
    private double commRate;
    
    public Commission (String name,
                        String address, 
                        String phone, 
                        String social, 
                        double hourlyRate, 
                        double commRate) {
        super(name, address, phone, social, hourlyRate);
        this.commRate = commRate;
    }
    
    public void addSales(double tSales) {
        totalSales += tSales;
    }
    
    public double pay() {
        return totalSales * commRate + super.pay();
    }
}
