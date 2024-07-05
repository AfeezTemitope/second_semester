
public enum NigeriaZones {
    NORTH_CENTRAL("Benue,FCT,KWARA,NASARAWA,NIGER,PLATEAU"),
    NORTH_EAST("Adamawa,Bauchi,Borno,Gombe,Taraba,Yobe");

    private String[] zone;

    NigeriaZones(String state) {
        this.zone = state.split(",");
    }

    public boolean getState(String newState) {
        for (String state : zone) {
            if (state.equals(newState)) return true;
        }
        return false;
    }

//    public static void main(String... a) {
//
//    }
}


