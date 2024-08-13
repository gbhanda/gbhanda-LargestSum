
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int sum = 0;
        int index = 1;
        for(int number: nums){
            if(nums.indexOf(number) < (nums.size() - 1)){
                for(int i = index; i < nums.size(); i++){
                    if((number + nums.get(i)) > sum) sum = (number + nums.get(i)) ;
                }
                index++;
            }
        }
        return sum;
    }
}