package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VoivodshipMapper {

    public static Map<Integer, String> mapVoivodship(List<String> loadedRawData) {
        Map<Integer, String> voivodshipsMap = new HashMap<>();

        loadedRawData.stream()
                .filter(line -> line.contains("województwo"))
                .forEach(filteredLine -> {
                    String[] elements = filteredLine.split(";");
                    Integer number = Integer.parseInt(elements[0]);
                    String name = elements[4];
                    voivodshipsMap.put(number, name);
                    }
                );

        //My implementation, replaced with lamba usage 
//        for (String s : loadedRawData) {
//            if (s.contains("województwo")) {
//                String[] elements = s.split(";");
//                voivodshipsMap.put(Integer.parseInt(elements[0]),elements[4]);
//            }
//        }
        return voivodshipsMap;
    }
}
