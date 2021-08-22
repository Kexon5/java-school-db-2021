package homework.matematik;

import homework.matematik.operations.Operation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Exercise {
    private int a;
    private int b;
    private Operation operation;
    private int answer;

}
