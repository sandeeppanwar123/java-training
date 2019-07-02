package java8.functional;

@FunctionalInterface
public interface InterestCalculationPredicate<Integer> {
  boolean test(Integer t);

   String toString();
}
