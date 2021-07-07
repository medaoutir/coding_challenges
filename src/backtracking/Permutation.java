package backtracking;

import java.util.stream.IntStream;

public class Permutation<T> {

    public static void main(String[] args)
    {
        int n = 5;
        Integer[] tab = IntStream.range(1,n+1).boxed().toArray(Integer[]::new);
        Permutation permutation = new Permutation();
        permutation.printAllRecursive(tab.length, tab);
    }

    /**
     * permutation function
     * @param elements table to calculate permutation for
     * @param n table size
     */
    public void printAllRecursive(
            int n, T[] elements) {

        if(n == 1) {
            printArray(elements);
        } else {
            for(int i = 0; i < n-1; i++) {
                printAllRecursive(n - 1, elements);
                if(n % 2 == 0) {
                    swap(elements, i, n-1);
                } else {
                    swap(elements, 0, n-1);
                }
            }
            printAllRecursive(n - 1, elements);
        }
    }

    /**
     * Swap Characters at position
     * @param elements table value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public void swap(T[] elements, int i, int j)
    {   T temp;
        temp = elements[i] ;
        elements[i] = elements[j];
        elements[j] = temp;
    }

    private void printArray(T[] input) {
        System.out.print('\n');
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
        }
    }
}
