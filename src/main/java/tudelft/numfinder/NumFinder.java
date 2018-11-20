package tudelft.numfinder;

public class NumFinder {
    private Integer smallest = null;
    private Integer largest = null;

    public void find(Integer[] nums) {
        if(nums.length == 0)
        {
            System.out.println("Must enter a valid number");
        }
        else {
            for (Integer n : nums) {

                if (n < smallest)
                    smallest = n;
                if (n > largest)
                    largest = n;
            }
        }
    }

    public Integer getSmallest () {
        return smallest;
    }

    public Integer getLargest () {
        return largest;
    }

}
