package QuestionAnswers;

import java.util.ArrayList;

public class ForEven {
    public static void main(String[] args) {
//        Assign arraylist
        ArrayList<Integer> nums = new ArrayList<>();

//        Add each even number to the array
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                nums.add(i);
            }
        }
//        Print the array
        System.out.println(nums);
    }
}
