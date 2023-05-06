import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int[] prime=new int[3000];
        prime[0]=2;
        prime[1]=3;
        int ptr=2;
        for(int i=5;i<=3500;i+=2){
            int j;
            for(j=0;j<ptr;j++){
                if(i%prime[j]==0){
                    break;
                }
            }
            if(j>=ptr){
                prime[ptr++]=i;
            }
        }
        int n=sc.nextInt();
        int ans=0;
        for(int i=6;i<=n;i++){
            int cnt=0;
            for(int j=0;prime[j]<i;j++){
                if(i%prime[j]==0){
                    cnt++;
                }
            }
            if(cnt==2){
                ans++;
            }
        }
        System.out.println(ans);
    }
}