public class LargestElementInAnArray {
        // Largest Element in an Array
        public static  void main (String[]args){
            int ar[]={0,2,1,5,2,18,11,15,10};
            int largest =ar[0];
            int n = ar.length;

            for(int i= 0;i<n;i++){
                if(ar[i]>largest){
                    largest=ar[i];
                }
            }
            System.out.print(largest);
        }
    }

