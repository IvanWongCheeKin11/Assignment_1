package Basketball_Business;

public class BasketballBusiness {
    BasketballBusiness(String companyName, String address, String phoneNumber, String businessHours, String requirements){
        printDetails(companyName, address, phoneNumber, businessHours, requirements);
    }
    public void printDetails(String companyName, String address, String phoneNumber, String businessHours, String requirements){
        System.out.println("Company Name: \n" + companyName);
        System.out.println("Company Address: \n" + address);
        System.out.println("Phone Number: \n" + phoneNumber);
        System.out.println("Business Hours: \n" + businessHours);
        System.out.println("Requirements: \n" + requirements);
    }
}
