package homework.matematik.operations;

import homework.matematik.operations.computer.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Operation {
    PLUS(new PlusComputer()),
    MINUS(new MinusComputer()),
    MULTIPLY (new MultiplyComputer()),
    DIVIDE (new DivideComputer());

    private final OperationComputer operationComputer;
}
