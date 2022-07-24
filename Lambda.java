import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("CDMX");
        cities.add("TOKIO");
        cities.add("BERLIN");
        cities.add("BRASILIA");
        cities.add("WACHINGTON");
        cities.add("OTAWA");
        cities.add("BRUSELAS");
        cities.add("BUENOS AIRES");
        cities.add("MADRID");
        cities.add("BOGOTA");
        cities.add("DAKOTA");
        cities.add("ARIZONA");
        cities.add("FLORIDA");
        cities.add("MONTERREY");
        cities.add("PARIS");
        cities.add("MILAN");
        cities.add("PEKIN");
        cities.add("SEUL");
        cities.add("LIMA");

        /*
        for (String city : cities){
            System.out.println(city);
        }
         */

        cities.stream().forEach(city -> System.out.println(city));
        //cities.stream().forEach(Main::printCity);
    }

    public static void printCity(String city){
        System.out.println(city);
    }
}
