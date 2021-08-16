package homework.lab1;

/**
 * @author Andrew Kuzin
 */
public class SuperIntegerListImpl implements SuperIntegerList {
    private final double COEF_EXPANSION = 1.5;
    private final int DEFAULT_SIZE = 10;

    private int[] data;
    private int indexFill = 0;

    public SuperIntegerListImpl(int[] data) {
        indexFill = data.length;
        this.data = new int[(int) (COEF_EXPANSION * indexFill)];
        System.arraycopy(data, 0, this.data, 0, indexFill);
    }

    public SuperIntegerListImpl() {
        data = new int[(int) (COEF_EXPANSION * DEFAULT_SIZE)];
    }

    @Override
    public void add(int number) {
        if (indexFill == data.length) {
            int[] tmpArr = data.clone();
            data = new int[(int) (COEF_EXPANSION * (indexFill + 1))];
            System.arraycopy(tmpArr, 0, data, 0, tmpArr.length);
        }
        data[indexFill++] = number;
    }

    @Override
    public void removeByIndex(int index) {
        if (index >= indexFill) {
            return;
        }
        for (int i = 0, j = 0; i < indexFill; i++) {
            if (i != index) {
                data[j++] = data[i];
            }
        }
        indexFill--;
    }

    @Override
    public void removeByValue(int value) {
        int indexClearedArray = 0;
        for (int i = 0, j = 0; i < indexFill; i++) {
            if (data[i] != value) {
                data[indexClearedArray++] = data[i];
            }
        }
        indexFill = indexClearedArray;
    }

    @Override
    public int get(int index) {
        if (index < indexFill && index >= 0) {
            return data[index];
        } else {
            return Integer.MAX_VALUE;
        }
    }

    @Override
    public void printAll() {
        System.out.print("{ ");
        for (int i = 0; i < indexFill; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        System.out.println("Test ctors:\n");
        SuperIntegerListImpl sil1 = new SuperIntegerListImpl();
        SuperIntegerList sil2 = new SuperIntegerListImpl(new int[]{1, 2, 5, 8, 9});
        sil1.printAll();
        sil2.printAll();

        System.out.println("--------------------------------------------\n");

        System.out.println("Test add:\n");
        sil2.printAll();
        for (int i = 0; i < 20; i++) {
            sil2.add(i);
        }
        sil2.printAll();

        System.out.println("--------------------------------------------\n");

        System.out.println("Test get:");
        sil2.printAll();
        System.out.println("arr[size-1] = " + sil2.get(24));
        System.out.println("arr[size] = " + sil2.get(25));

        System.out.println("--------------------------------------------\n");

        System.out.println("Test remove by index and by value:\n");

        sil2.printAll();

        System.out.println("Delete 23-th element:");
        sil2.removeByIndex(23);
        sil2.printAll();

        System.out.println("Delete all 1 and 2 values:");
        sil2.removeByValue(1);
        sil2.removeByValue(2);
        sil2.printAll();

        System.out.println("Try delete 25:");
        sil2.removeByValue(25);
        sil2.printAll();
    }
}
