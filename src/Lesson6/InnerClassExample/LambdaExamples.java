package Lesson6.InnerClassExample;

import java.util.function.*;

public class LambdaExamples {
    public static void main(String[] args) {
        BooleanSupplier e1 = () -> true;
        e1.getAsBoolean();

        DoubleBinaryOperator e2 = (left, right) -> {
            double result = 2.0;
            return result;
        };
        e2.applyAsDouble(3.0, 1.9);

        DoubleConsumer e3 = value -> System.out.println(value);
        e3.accept(5.0);

        DoublePredicate e4 = value -> true;
        e4.test(1.0);

        DoubleSupplier e5 = () -> 1.0;

        DoubleToIntFunction e6 = value -> 1;

        DoubleToLongFunction e7 = value -> 1L;

        DoubleUnaryOperator e8 = operand -> 1.0;

        IntBinaryOperator e9 = (left, right) -> 1;

        IntConsumer e10 = value -> System.out.println(value);

        IntPredicate e11 = value -> true;
        LongToDoubleFunction e12 = value -> {
            double a = (double) value;
            return a;
        };

        System.out.println(e12.applyAsDouble(2L));


    }
}
