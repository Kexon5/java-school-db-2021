package homework.matematik.generators;

import homework.matematik.Exercise;
import homework.matematik.operations.Operation;
import org.apache.commons.lang3.RandomUtils;

public class MinusPositiveExpressionGenerator extends GeneratorByRequirement{

    public Exercise getExercise() {
        int b = RandomUtils.nextInt(min, max - 1);
        int a = RandomUtils.nextInt(b + 1, max);
        return Exercise.builder()
                .a(a)
                .b(b)
                .operation(Operation.MINUS)
                .answer(Operation.MINUS.getOperationComputer().compute(a, b))
                .build();
    }
}
