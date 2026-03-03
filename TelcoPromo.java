public class TelcoPromo {

    public static void main(String[] args) {

        TelcoSubscription smart = new Telco("Smart", 500, 15, false);
        TelcoSubscription globe = new Telco("Globe", 450, 10, true);
        TelcoSubscription ditto = new Telco("Ditto", 400, 8, true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallsTextOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price: " + smart.accept(promo, 500));
        System.out.println("Globe Data Usage Offer and price: " + globe.accept(promo, 450));
        System.out.println("Dito Data Usage Offer and price: " + ditto.accept(promo, 400));

        System.out.println("\nSmart unlimited calls and text package: " + smart.accept(unli, false));
        System.out.println("Globe unlimited calls and text package: " + globe.accept(unli, true));
        System.out.println("Ditto unlimited calls and text package: " + ditto.accept(unli, true));
    }
}