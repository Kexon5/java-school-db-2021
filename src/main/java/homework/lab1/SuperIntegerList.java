package homework.lab1;

/**
 * @author Andrew Kuzin
 */
public interface SuperIntegerList {

    void add(int number);

    void removeByIndex(int index);

    void removeByValue(int value);

    int get(int index);

    void printAll();
}
