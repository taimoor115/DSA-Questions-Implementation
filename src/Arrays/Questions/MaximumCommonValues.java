package Arrays.Questions;
import java.util.Arrays;

public class MaximumCommonValues
{
        public int min(int [] arr)
        {
            int min = arr[0];
            for (int i = 0; i < arr.length; i++)
            {
                if(arr[i]<min)
                {
                    min = arr[i];
                }
            }
            return min;
        }
        public int minNumber(int [] arr,int [] nums )
        {
            Arrays.sort(arr);
            Arrays.sort(nums);
            int sameIndex = 0;
            for(int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < nums.length; j++)
                {
                    if(arr[i] == nums[j])
                    {
                        sameIndex++;
                    }
                }
            }
            int [] result = new int[sameIndex];
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < nums.length; j++)
                {
                    if(arr[i] == nums[j])
                    {
                        result[j] = nums[j];
                    }
                }
            }
            return min(result);
        }
        public static void main(String [] args) {
         MaximumCommonValues mv = new MaximumCommonValues();
            int arr[] = {1,2,3};
            int[] arr1 ={4,3,2};
            System.out.println(mv.minNumber(arr, arr1));
        }
    }

