public class Subarrays {
  public static void main(String[] args) {
    int numbers[]={2,4,6,8,10};
    printSubarrays(numbers);
  }
  public static void printSubarrays(int numbers[]){
    int count=0;
    for(int i=0;i<numbers.length;i++){
      int start=i;
      for(int j=i;j<numbers.length;j++){
        int end=j;
        for(int k=start;k<=end;k++){
          System.out.print(numbers[k]+" ");
          count++;
        }
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("TOTAL SUBARRAYS:"+count);
  }
}
