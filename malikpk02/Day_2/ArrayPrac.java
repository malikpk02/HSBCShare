
public class ArrayPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {45,34,57,12,90,66,88,20};
       int min,max;
       min=max=arr[0];
       for(int i=1;i<arr.length;i++)
       {
    	   if(arr[i]<min)
    		   min=arr[i];
    	   if(arr[i]>max)
    		   max=arr[i];
       }
       System.out.println("Lowest Element : "+min);
       System.out.println("Highest Element : "+max);
       String[] city= {"Hyderabad","Pune","Delhi","Ambala","Mumbai","Kolkata"};
       String small=city[0];
       for(int i=1;i<city.length;i++)
       {
    	   if(small.length()<city[i].length())
    	   {
    		   small=city[i];
    	   }
       }
       System.out.println("Shortest City : "+small);
	}

}
