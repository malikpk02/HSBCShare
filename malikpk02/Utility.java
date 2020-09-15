

public class Utility {
    public static long factorial(int x)
    {
    	long res=1L;
    	for(int i=2;i<=x;i++)
    		res*=i;
    	return res;
    }
    public static int sumNatural(int x)
    {
    	int res=(x*(x+1))/2;
    	return res;
    }
    public static boolean isPrime(int x)
    {
    	boolean res=true;
    	if(x==1)
    		return false;
    	else if(x%2==0||x%3==0)
    		return false;
    	int num=6;
    	while(num<x)
    	{
    		if(x%(num-1)==0)
    		{
    			res=false;
    			break;
    		}
    		else if(num+1<x&&x%(num+1)==0)
    		{
    			res=false;
    			break;
    		}
    			num+=6;
    	}
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(factorial(8));
       System.out.println(sumNatural(20));
       System.out.println(isPrime(23));
       System.out.println(isPrime(202));
	}

}
