package homework.matematik.teachers;

import homework.matematik.generators.DoubleFiguresExpressionGenerator;
import homework.matematik.generators.MinusPositiveExpressionGenerator;

import java.util.List;

public class OlgaVladimirovnaTeacher extends Teacher{
    public OlgaVladimirovnaTeacher() {
        this.requirementList = List.of(new DoubleFiguresExpressionGenerator(), new MinusPositiveExpressionGenerator());
    }
}
