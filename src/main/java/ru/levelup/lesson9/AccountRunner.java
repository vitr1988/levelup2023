package ru.levelup.lesson9;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class AccountRunner {
    public static void main(String[] args) {
        BigDecimal result = new BigDecimal("1000.2");
        double resultDouble = 1000d / 7;
        System.out.println("Бигдецимал " + result);
        System.out.println("Дабл " + resultDouble);
        result = result.add(BigDecimal.TEN, new MathContext(0, RoundingMode.FLOOR));

        System.out.println(result);

        BigInteger bigInteger = new BigInteger("32424252454252443784275946252756248756247856278546287585278");
        System.out.println(bigInteger);
        double v = bigInteger.doubleValue();
    }
}
