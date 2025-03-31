package GFGTopArray;

public class maxConsecutiveCount {
    public static void main(String[] args) {

    }
    public int maxConsecutiveCount(int[] arr) {
        // code here
        int count = 1;
        int res = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                res = Math.max(res,count);
                count=1;
            }
        }
        return Math.max(res,count);
    }
}
