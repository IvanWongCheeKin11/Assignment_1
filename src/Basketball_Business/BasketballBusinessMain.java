package Basketball_Business;

public class BasketballBusinessMain {

    public static void main(String[] args) {

        System.out.println("Company Details");
        BasketballBusiness bb = new BasketballBusiness("Ivan Basketball Business Sdn.Bhd", "18 JALAN BASKETBALL 18,\nTAMAN SPORT,\n30010 IPOH,\nPERAK,\nMALAYSIA.", "+601126302064", "0900 - 0000", "Basketball");

        System.out.println("Type Of Sport Basketball");
        TypeOfSportBasketball tb = new TypeOfSportBasketball();

        System.out.println();
        System.out.println("Employees A");
        Employees eA = new Employees();

        System.out.println();
        System.out.println("Employees B");
        Employees eB = new Employees();

        System.out.println();
        System.out.println("Employees C");
        Employees eC = new Employees();

        System.out.println();
        System.out.println("Customer A");
        Customer cA = new Customer();

        System.out.println();
        System.out.println("Customer B");
        Customer cB = new Customer();

        System.out.println();
        System.out.println("Customer C");
        Customer cC = new Customer();

        System.out.println();
        System.out.println("Advertisement Options");
        AdvertisementAndMarketing b1 = new AdvertisementAndMarketing();

        System.out.println();
        System.out.println("Basketball Court");
        BasketballCourt e3 = new BasketballCourt();

        System.out.println();
        System.out.println("Financial Statement for the first half of the year");
        Financial f1 = new Financial();

        System.out.println();
        System.out.println("Financial Statement for the second half of the year");
        Financial f2 = new Financial();

    }

}