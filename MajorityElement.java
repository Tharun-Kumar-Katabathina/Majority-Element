import java.util.Scanner;

class MajorityElement{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Size of the Array n : ");
        int n=s.nextInt();
        int mode=0,mc=0;
        int[] arr=new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if (arr[j]==arr[i]){
                    ++c;
                }
            }
            if(c>mc){
                mode=arr[i];
                mc=c;
            }
        }
        if(mc>n/2){
            System.out.println(mode);
        }
        else{
            System.out.println(-1);
        }

    }
}
