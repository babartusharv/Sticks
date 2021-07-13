import java.util.*;
import java.lang.*;
import java.io.*;


public class Sticks
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    SuperReader sr = new SuperReader();
	    int t = sr.nextInt();
	    while(t-->0){
    int n=Integer.parseInt(sr.nextLine());
    String s=sr.nextLine();
    String[] arr=s.split(" ");
    int[] ar=new int[n];
    for(int m=0;m<n;m++)
    {
    ar[m]=Integer.parseInt(arr[m]);
    }
    Arrays.sort(ar);
    int l=0;
    int b=0;
    int x=0;
    for(int j=n-1; j>0;j--)
    {
    if(ar[j]==ar[j-1])
    {
    x=j-2;
    l=ar[j];
    break;
    }
    x=0;
    }
    for(int k=x;k>0;k--)
    {
    if(ar[k]==ar[k-1])
    {
    b=ar[k];
    break;
    }
    }
    if((l*b)==0)
    {
    System.out.println("-1");
    }
    else
    {
    System.out.println((l*b));
    }
    }
}
	static class SuperReader
    {
    BufferedReader br;
    StringTokenizer st;
    public SuperReader(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    String next()
    {
        while (st == null || !st.hasMoreElements())
        {
            try{
            st = new StringTokenizer(br.readLine());
            }catch (IOException e)
                {
            e.printStackTrace(); }
        }
        return st.nextToken();
    }
    
    int nextInt(){
        return Integer.parseInt(next());
        }
    long nextLong(){
        return Long.parseLong(next());
        }
    double nextDouble(){
        return Double.parseDouble(next());
        }
    String nextLine(){
        String str = "";
        try{
            str = br.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        return str;
    }
    
    int[] nextArray(int n) {
        int[] a=new int[n];
        for(int i=0; i<n; i++) a[i]=nextInt();
        return a;
    	}
    }
}