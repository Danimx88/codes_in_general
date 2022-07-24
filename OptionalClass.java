import java.util.Optional;

public class OptionalCalss {
    public static void main(String[] args) {
        Optional<Double> result = averageScores(10.0, 10.0, 9.5, 10.0);
        if (result.isPresent()){
            System.out.println(result.get());
        }else {
            System.out.println("Nothing");
        }

    }
    public static Optional<Double> averageScores(Double  ...scores){
        if(scores.length == 0 ){
            return Optional.empty();
            //return null;
        }
        double sum = 0;
        for (Double score : scores) sum+= score;
        return  Optional.of(sum / scores.length);

    }

}
