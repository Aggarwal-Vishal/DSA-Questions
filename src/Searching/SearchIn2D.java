package Searching;

public class SearchIn2D {
    public static void main(String[] args) {
        int nums[][] = { { 1, 2, 3, 4 },
                         { 5, 6, 7, 8 },
                         { 9, 10, 11, 12 }
        };
        print2D(nums);

    }
    static void print2D(int nums[][]){
        //for rows
        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++){
                System.out.println(nums[i][j]);
            }

        }
    }
}
