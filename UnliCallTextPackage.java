public class UnliCallTextPackage implements UnliCallsTextOffer {

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {

        if (!unliCallText) {
            return "Not offered.";
        }
        if (telcoName.equalsIgnoreCase("Smart")) {
            return "This plan do not offer any free calls or texts, and you will be charged per use.";
        } 
        else if (telcoName.equalsIgnoreCase("Globe")) {
            return "This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.";
        } 
        else if (telcoName.equalsIgnoreCase("Dito")) {
            return "This plan includes unlimited calls and texts to all networks within the country";
        } 
        else {
            return "Telco not supported.";
        }
    }
}