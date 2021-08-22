package homework.matematik.teachers;

import homework.matematik.generators.GeneratorByRequirement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    protected List<GeneratorByRequirement> requirementList;
}
