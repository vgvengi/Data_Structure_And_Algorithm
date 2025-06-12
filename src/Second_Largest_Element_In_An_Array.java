public class Second_Largest_Element_In_An_Array {
    public  static void main(String []args){

        int[] a ={1,5,10,30,12,18,20};
        int n =a.length;
        int i;
        int largest=a[0];
        int secondLargest=-1;
        for( i=0;i<n;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        System.out.println(largest);
        for(i=0;i<n;i++){
            if(a[i]>secondLargest && a[i]!= largest){
                secondLargest=a[i];
            }
        }
        System.out.println(secondLargest);
    }
}
