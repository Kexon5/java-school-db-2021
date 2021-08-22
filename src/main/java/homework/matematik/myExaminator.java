package homework.matematik;

import homework.matematik.generators.GeneratorByRequirement;
import homework.matematik.teachers.OlgaVladimirovnaTeacher;
import homework.matematik.teachers.Teacher;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class myExaminator implements Examinator{
    private Teacher teacher;

    @Override
    public Exercise generate() {
        List<GeneratorByRequirement> requirementList = teacher.getRequirementList();
        return requirementList.get(RandomUtils.nextInt(0, requirementList.size() - 1))
                .getExercise();
    }

    @Override
    public List<Exercise> generate(int num) {
        List<Exercise> exercises = new ArrayList<>();
        List<GeneratorByRequirement> requirementList = teacher.getRequirementList();
        for (int i = 0; i < num; i++) {
            exercises.add(requirementList.get(RandomUtils.nextInt(0, requirementList.size() - 1))
                    .getExercise());
        }
        return exercises;
    }

    public static void main(String[] args) {
        myExaminator examinator = new myExaminator(new OlgaVladimirovnaTeacher());
        List<Exercise> exercise = examinator.generate(10);
        exercise.forEach(System.out::println);
    }
}
