package easy;

import java.util.ArrayList;

public class ProductSum {

    public static int getProductSum(ArrayList<Object> input, int depth) {
        int sum = 0;
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) instanceof Integer) {
                sum = (int) input.get(i) + sum;
            } else if (input.get(i) instanceof ArrayList) {
                sum = sum + (depth + 1) * getProductSum((ArrayList<Object>) input.get(i), depth + 1);
            }
        }

        return sum;

    }

    public static void main(String args[]) {
        ArrayList<Object> my = new ArrayList<>();
        ArrayList<Object> first = new ArrayList<>();
        ArrayList<Object> second = new ArrayList<>();
        ArrayList<Object> third = new ArrayList<>();
        my.add(5);
        my.add(2);
        first.add(7);
        first.add(-1);
        my.add(first);
        my.add(3);


        second.add(6);
        third.add(-13);
        third.add(8);
        second.add(third);
        my.add(4);
        my.add(second);

        System.out.print(getProductSum(my, 1));
    }
}
