import java.util.*;
public class Main{
    
    static public int maxf(int e,int f,int g)
    {
        if(e>f&&e>g)return e;
        if(f>e&&f>g)return f;
        else
            return g;
        
    }
    static public int fun(int n,int a,int b, int c)
    {
        if(n==0)
            return 0 ;
        if(n<0)
            return -1;
        int x=maxf((fun(n-a,a,b,c)),(fun(n-b,a,b,c)),(fun(n-c,a,b,c)));
        if(x==-1)
            return -1;
        return x+1;
            }
//System.out.print(s);      
    public static void main (String[] args) {
       int t=fun(23,11,9,12);
      if(t>0)
        System.out.println(t);
      else
        System.out.println("Oh no Sepcs are not good");
    }
}