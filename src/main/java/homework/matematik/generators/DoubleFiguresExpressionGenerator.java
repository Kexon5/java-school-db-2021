package homework.matematik.generators;

import homework.matematik.Exercise;
import homework.matematik.operations.Operation;
import org.apache.commons.lang3.RandomUtils;

public class DoubleFiguresExpressionGenerator extends GeneratorByRequirement{
    public DoubleFiguresExpressionGenerator() {
        this.min = 10;
        this.max = 99;
    }

    @Override
    public Exercise getExercise() {
        int a = RandomUtils.nextInt(min, max);
        int b = RandomUtils.nextInt(min, max);
        Operation op = Operation.values()[RandomUtils.nextInt(0, Operation.values().length - 1)];
        return Exercise.builder()
                .a(a)
                .b(b)
                .operation(op)
                .answer(op.getOperationComputer().compute(a, b))
                .build();
    }
}
