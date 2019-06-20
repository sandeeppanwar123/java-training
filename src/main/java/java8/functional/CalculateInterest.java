package java8.functional;

import java.math.BigDecimal;

public class CalculateInterest {

    public static void main(String[] args) {
CalculateInterest calculateInterest = new CalculateInterest();

        System.out.println(calculateInterest.calculateInterestAmount(10000, (y) -> (Integer)y > 1000 ));
        System.out.println(calculateInterest.calculateInterestAmount(10000, (y) -> (Integer)y > 50000 ));
    }

    BigDecimal calculateInterestAmount(Integer capital, InterestCalculationPredicate predicate)
    {
        BigDecimal  interest = new BigDecimal(0.0);

        if(predicate.test(capital))
            interest = new BigDecimal((capital * 10)/100);
        return  interest;

    }
}
