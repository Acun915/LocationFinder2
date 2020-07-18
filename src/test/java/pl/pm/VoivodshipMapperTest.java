package pl.pm;

import model.VoivodshipMapper;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;


public class VoivodshipMapperTest {

    @Test
    public void VoivodshipMapperTest() {
        Map<Integer, String> testerMap = new HashMap<>();
        testerMap.put(2, "DOLNOŚLĄSKIE");
        testerMap.put(4, "KUJAWSKO-POMORSKIE");
        testerMap.put(6, "LUBELSKIE");

        Map<Integer, String> trueMap = VoivodshipMapper.mapVoivodship(DataLoader.loadData("TREC.txt"));

        assertEquals(testerMap.get(2), trueMap.get(2));
        assertEquals(testerMap.get(4), trueMap.get(4));
        assertEquals(testerMap.get(6), trueMap.get(6));
    }



}
