import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//import static NigeriaZones.NORTH_CENTRAL;

class NigeriaZonesTest {
    @Test
    public void testThatStateExist(){
        NigeriaZones nigeriaZones =  NigeriaZones.NORTH_CENTRAL;
        assertTrue(nigeriaZones.getState("Benue"));
    }

}