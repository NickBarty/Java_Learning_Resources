package QuestionAnswers;

import java.util.ArrayList;

public class ForEachEven {
    public static void main(String[] args) {
//        Assign arraylist
        ArrayList<Integer> nums = new ArrayList<>();

//        Add each even number to the array
        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                nums.add(i);
            }
        }

//        For each loop to print each value in array list
        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}
