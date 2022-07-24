import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalClass2 {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();

        countries.add("United States");
        countries.add("Mexico");
        countries.add("Argentina");
        countries.add("Canada");
        countries.add("Francia");
        countries.add("Alemania");
        countries.add("Suiza");
        countries.add("Japon");
        countries.add("Italia");
        countries.add("China");
        countries.add("Corea del sur");
        countries.add("Brasil");
        countries.add("Ecuador");
        countries.add("Colombia");

        Optional<String> country = countries.stream()
                .filter(c -> c.startsWith("Me")).findAny();
        countries.stream().filter(c -> c.equals("Mexico")).findFirst();


        //Para realizar la utilizacióm

        /*if (country.isPresent()){
            System.out.println(country.get());
        }*/
        country.ifPresent(System.out::println);
    }
}
