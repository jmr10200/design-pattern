package hello.example.designpattern.singleton.yuki;

import java.util.HashMap;
import java.util.Map;

public class Triple {

    private static Map<String, Triple> tripleMap = new HashMap<>();

    private static String[] names = {"ALPHA", "BETA", "GAMMA"};

    static {
        for (String name : names) {
            tripleMap.put(name, new Triple(name));
        }
    }

    private Triple(String name) {
        System.out.println(name + " 인스턴스가 생성되었습니다.");
    }

    public static Triple getInstance(String name) {
        Triple triple = tripleMap.get(name);
        if (triple == null) {
            System.out.println(name + " (으)로 생성된 인스턴스가 없습니다.");
        }
        return triple;
    }

}
