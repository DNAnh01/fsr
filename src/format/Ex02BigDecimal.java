package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02BigDecimal {
    public static void main(String[] args) {
        // BigDecimal, BigInteger
        // calculation method >> add, subtract, multiply, divide
        // rounding >> setScale, roundMode

        BigDecimal a = BigDecimal.ZERO;
        BigDecimal b = BigDecimal.ONE;
        BigDecimal c = BigDecimal.TEN;
        BigDecimal d = BigDecimal.valueOf(12.5);

        BigDecimal e = BigDecimal.valueOf(278.254);
        BigDecimal f = BigDecimal.valueOf(197.789);

        BigDecimal add = a.add(b);
        BigDecimal sub = c.subtract(b);
        BigDecimal mul = d.multiply(e);
        BigDecimal div = f.divide(c);

        System.out.println("add: " + add);
        System.out.println("sub: " + sub);
        System.out.println("mul: " + mul);
        System.out.println("div: " + div);

        // mul: 3478.1750
        mul = mul.setScale(2, RoundingMode.HALF_UP);
        System.out.println("mul: " + mul);
    }
}