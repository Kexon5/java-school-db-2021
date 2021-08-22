package homework.matematik.generators;

import homework.matematik.Exercise;
import homework.matematik.operations.Operation;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.RandomUtils;

@AllArgsConstructor
public class PlusPositiveExpressionGenerator extends GeneratorByRequirement{

    public Exercise getExercise() {
        int a = RandomUtils.nextInt(min, max);
        int b = RandomUtils.nextInt(min, max);
        return Exercise.builder()
                .a(a)
                .b(b)
                .operation(Operation.PLUS)
                .answer(Operation.PLUS.getOperationComputer().compute(a, b))
                .build();
    }
}
