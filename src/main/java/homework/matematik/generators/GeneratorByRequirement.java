package homework.matematik.generators;

import homework.matematik.Exercise;

public abstract class GeneratorByRequirement {
    protected int min = 1;
    protected int max = 100;

    public abstract Exercise getExercise();
}
