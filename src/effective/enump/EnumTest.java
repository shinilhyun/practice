package effective.enump;

import java.util.function.BiFunction;
import java.util.function.Function;

enum CalcuatorType {

    CALC_A(value -> value),
    CALC_B(value -> value * 10),
    CALC_C(value -> value * 3),
    CALC_D(value -> 0L),
    CALC_E((value1, value2) -> value1 + value2);

    private Function<Long, Long> expression;
    private BiFunction<Long,Long,Long> expression2;

    CalcuatorType(Function<Long, Long> expression) {
        this.expression = expression;
    }
    CalcuatorType(BiFunction<Long, Long, Long> expression2) {
        this.expression2 = expression2;
    }

    public long calculatge(long value) {
        return expression.apply(value);
    }
    public long calculatge(long value1, long value2) {
        return expression2.apply(value1, value2);
    }
}

public class EnumTest {
    public static void main(String[] args) {
        long a = 10;
        System.out.println(CalcuatorType.CALC_A.calculatge(a));
        System.out.println(CalcuatorType.CALC_B.calculatge(a));
        System.out.println(CalcuatorType.CALC_C.calculatge(a));
        System.out.println(CalcuatorType.CALC_D.calculatge(a));
        System.out.println(CalcuatorType.CALC_E.calculatge(a, 20));

    }
}
