import java.util.*;

public class UnliCallTextPackage implements UnliCallsTextOffer{
    private static Map<String, String> uOfferMap = new HashMap<>();

    static {
        uOfferMap.put("Smart", "Not offered");
        uOfferMap.put("Globe", "Offered for Globe Subscribers");
        uOfferMap.put("Dito", "Offered to all networks");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return uOfferMap.get(telcoName);
    }
}