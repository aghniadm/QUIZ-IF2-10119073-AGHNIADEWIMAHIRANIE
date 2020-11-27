package quiz.if2.pkg10119073.aghniadewimahiranie;

public class ServicePrice implements ServiceItem{
    private float priceService, discount;
    
    public float getPriceService(){
        return priceService;
    }
    
    public void setPriceService(float priceService){
        this.priceService = priceService;
    }
    
    public void displayService(){
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.print("Choose (1/2/3): ");
    }
    
    public float getPrice(int serviceItem){
        priceService = switch (serviceItem) {
            case 1 -> 45000;
            case 2 -> 55000;
            case 3 -> 15000;
            default -> 0;
        };
        return priceService;
    }
    
    public boolean checkMemberStatus(String statusMember){
        return true;
    }
    
    public float getSale(boolean isMember, float parServicePrice){
        
        return 0;
    }
    
    public float getTotalPay(float priceService, float discount){
        return 0;
    }
}
