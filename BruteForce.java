public class BruteForce {
  public static void main(String[] args) {
    int numbers[]={1,-2,6,-1,3};
    printSubarrays(numbers);
  }

  public static void printSubarrays(int numbers[]){
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;

    for(int i=0;i<numbers.length;i++){
      int start=i;
      for(int j=i;j<numbers.length;j++){
        int end=j;
        currSum=0;
        for(int k=start;k<=end;k++){
          currSum+=numbers[k];
        }
        System.out.println("SUM:"+currSum);
        if(maxSum<currSum){
          maxSum=currSum;
        }
      }
    }
    System.out.println("MAX SUM:"+maxSum);
  }
}
