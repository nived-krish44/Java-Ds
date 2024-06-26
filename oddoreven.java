import java.util.*;


public class oddoreven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            arr[i]=val;
        }
        HashMap<Integer,Integer> odd = new HashMap<>();
        HashMap<Integer,Integer> even = new HashMap<>();
        int oddcnt=0;
        int evencnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                if(odd.get(arr[i])!=null){
                    odd.put(arr[i], odd.get(arr[i])+1);
                }else odd.put(arr[i],1);
                oddcnt++;
            }
            else{
                if(even.get(arr[i])!=null){
                    even.put(arr[i], even.get(arr[i])+1);
                }
                else{
                    even.put(arr[i],1);}
                    evencnt++;
                }
            }
            int[] oddarr = new int[oddcnt];
            int[] evenarr = new int[evencnt];
            int j=0;
            int k=0;
        for(int nums : odd.keySet()){
            if(odd.get(nums)>1){
                System.out.println(nums + "repeats" + odd.get(nums)+ "times");
                for(int i=0;i<odd.get(nums);i++){
                    oddarr[k]=nums;
                    k++;
                }
            }
            else{
                oddarr[k]=nums;
                k++;
            }
        }
        for(int nums : even.keySet()){
            if(even.get(nums)>1){
                System.out.println(nums + "repeats" + even.get(nums)+ "times");
                for(int i=0;i<even.get(nums);i++){
                    evenarr[j]=nums;
                    j++;
                }
            }
            else{
                evenarr[j]=nums;
                j++;
            }
        }
        System.out.println("even array");
        for(int nums: evenarr) System.out.println(nums);
        System.out.println("odd array");
        for(int nums: oddarr) System.out.println(nums);
  
    }
}
