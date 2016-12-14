import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class Exercise1 {
  public static void main(String[] args) {
    final List<Dish> myStream =
    Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
      new Dish("beef", false, 700, Dish.Type.MEAT),
      new Dish("chicken", false, 400, Dish.Type.MEAT),
      new Dish("french fries", true, 530, Dish.Type.OTHER),
      new Dish("rice", true, 350, Dish.Type.OTHER),
      new Dish("season fruit", true, 120, Dish.Type.OTHER),
      new Dish("pizza", true, 550, Dish.Type.OTHER),
      new Dish("prawns", false, 400, Dish.Type.FISH),
      new Dish("salmon", false, 450, Dish.Type.FISH));

    myStream.stream().forEach(x -> System.out.println(x));

    List<Dish> dishes =
    myStream.stream()
    .filter(d -> d.getType() == Dish.Type.MEAT)
    .limit(2)
    .collect(toList());
    System.out.println(dishes);

    List<Dish> dishes =
    myStream.stream()
    .filter(e -> e.)
  }
}