package ArraysBasic;

public class slargest {
    public static void main(String[] args) {
          int[] arr = {12,35,1,10,35};
        int l=Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > l){
                sl = l;
                l = arr[i];
            }else{
                if(arr[i] < l && arr[i] > sl ){
                    sl = arr[i];
                }
            }
        }
        System.out.println(sl);



    }
}
