import java.util.*;

class MapEx1 {
    public static void main(String[] args) {
        System.out.println("HashMap Example");
        Map<String, String> map3 = new HashMap<>();
        map3.put("koala", "bamboo");
        map3.put("lion", "meat");
        map3.put("giraffe", "leaf");
        String food = map3.get("koala");
        System.out.println("koala eats" +food);

        System.out.println("lion eats " +map3.getOrDefault("lion", "default"));
        System.out.println("lion eats " +map3.get("lion"));
        System.out.println("cow eats " + map3.getOrDefault("cow " ,  "default"));
        System.out.println("cow eats " +map3.get("cow"));

        map3.put("cow" , "grass");
        for(Map.Entry<String, String> me: map3.entrySet()) 
            System.out.println("key = " +me.getKey() + ", value = " +me.getValue());

        System.out.println("ex of put returning previous value " +map3.put("cow", "plants"));


        for(String key: map3.keySet())
            System.out.println("key = " +map3.get(key));


        System.out.println("map3.containsKey(\"koala\") = " +map3.containsKey("koala"));
        System.out.println("map3.containsValue(\"bread\") = " +map3.containsValue("bread"));
        System.out.println(map3.size());
        System.out.println("remove " +map3.remove("koala"));
        System.out.println("replace value for non existing key " +map3.replace("koala","grr"));

        for(Map.Entry<String, String> me: map3.entrySet()) 
            System.out.println("key = " +me.getKey() + ", value = " +me.getValue());

        System.out.println("remove" +map3.remove("koala"));


        System.out.println("remove boolean remove(k,v)" +map3.remove("cow", "gr"));
        System.out.println(map3);

        System.out.println("putIfAbsent " +map3.putIfAbsent("cow", "gr"));
        System.out.println(map3);

        System.out.println("putIfAbsent " +map3.putIfAbsent("cow", "gr"));
        System.out.println(map3);


        Map<String, String> map4 = new HashMap<>();
        map4.put("horse", "chickpea");
        map4.put("sparrow", "seeds");
        map4.put("giraffe " ,"tree leaves");
        map4.put("cow", "null");
        map4.put("null" , "null");
        map4.put("null", "null");
        System.out.println(map4);
        map4.putAll(map4);
        System.out.println(map3);
    }
}