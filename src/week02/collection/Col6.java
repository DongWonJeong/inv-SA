package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Col6 {
    public static void main(String[] args) {
        // Map : key - value pair
        // key 라는 값으로  unique 하게 보장이 되어야 함.
        // Map -> HashMap, TreeMap 으로 응용.

        Map<String, Integer> intMap = new HashMap<>();

        // 키 값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14);
        intMap.put("삼", 15);

        // key 값 전체 출력
        for(String key: intMap.keySet()){
            System.out.println(key);
        }

        // value 값 전체 출력
        for(Integer value: intMap.values()){
            System.out.println(value);
        }

        // get을 통해 value 가져오기
        System.out.println(intMap.get("삼"));
    }
}
