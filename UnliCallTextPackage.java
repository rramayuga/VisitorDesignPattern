public class UnliCallTextPackage implements UnliCallsTextOffer {

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {

        if (!unliCallText) {
            return "Not offered. You will be charged extra per use";
        }

        if (telcoName.equalsIgnoreCase("Smart")) {
            return "Not offered.";
        } 
        else if (telcoName.equalsIgnoreCase("Globe")) {
            return "Offered for Globe Subscribers. You will be charged extra for other networks calls and texts";
        } 
        else if (telcoName.equalsIgnoreCase("Dito")) {
            return "Offered to all networks";
        } 
        else {
            return "Telco not supported.";
        }
    }
}