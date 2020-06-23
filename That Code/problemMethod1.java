import java.util.*;
public class problemMethod1{
	public static void main(String args[]){

Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int items = sc.nextInt();
		//int length = items.length();
		int[] contents = new int[items];
		for(int i = 0; i<items;i++){
			contents[i] =rd.nextInt(900000000)+100000000;
		}

		int return1 = method1(contents);
		int return2 = method2(contents);
		int return3 = method3(contents);
		int return4 = method4(contents);

		System.out.println("method1 = " + return1);
		System.out.println("method2 = " + return2);
		System.out.println("method3 = " + return3);
		System.out.println("method4 = " + return4);
		
	}

	public static int method1(int[] x){
	int temp =0;
		for(int pass = 0; pass < x.length-1; pass++){
		for(int i = 0; i < x.length-1;i ++){
			if(x[i] > x[i+1]){
				temp = x[i];
				x[i] = x[i+1];
				x[i+1] = temp;
			}
		}
	}

	int k = 0;
	int[] y = new int[20];
		for(int i = 0; i < 20; i=i+2){
			y[k] = (Math.abs(x[i]-x[i+1]));
			k++;
		}

		int sum = y[19];
		for(int i = 18; i>=0; i--){
			if(sum>=0){
				sum-=y[i];
			}
			else{
				sum+=y[i];
			}
		}
		return Math.abs(sum);
	}

	public static int method2(int[] x){
		int temp =0;
	    for(int pass = 0; pass < x.length-1; pass++){
	    for(int i = 0; i < x.length-1;i ++){
	        if(x[i] < x[i+1]){
	            temp = x[i];
	            x[i] = x[i+1];
	            x[i+1] = temp;
	        }
	    }
	    }

	    int res = x[0];//max value
	    for(int i = 1; i < x.length;i++)
	    {
	        if(res>=0)
	        {
	            res-=(x[i]);
	        }
	        else
	        {
	            res+=(x[i]);
	        }
	    }
    	return(Math.abs(res));
			
	}

	public static int method3(int[] x){
		int temp =0;
	    for(int pass = 0; pass < x.length-1; pass++){
	    for(int i = 0; i < x.length-1;i ++){
	        if(x[i] < x[i+1]){
	            temp = x[i];
	            x[i] = x[i+1];
	            x[i+1] = temp;
	        }
	    }
	    }
	    //split array into two arrays
	    int half = x.length/2;
	    int[] y = new int[half];
	    int[] z = new int[half];

	    for(int i = 0; i < x.length;i++)
	    {
	    	if(i<half)
	    	{
	    		y[i]=x[i];
	    	}
	    	else
	    	{
	    		z[i-half]=x[i];
	    	}
	    }
	    int resy = y[0];
	    int resz = z[0];
	    for(int i = 1; i < half;i++)
	    {
	        if(resy==0)
	        {
	            resy=(y[i]);
	        }
	        else
	        {
	            resy=(y[i]);
	        }
	        if(resz==0)
	        {
	            resz=(z[i]);
	        }
	        else
	        {
	            resz=(z[i]);
	        }
	    }

	    	return(Math.abs(Math.abs(resy) - Math.abs(resz)));
		
	}

	public static int method4(int[] x){
		int temp = 0;
		for(int pass = 0; pass < x.length-1; pass++){
    		for(int i = 0; i < x.length-1;i ++){
        		if(x[i] < x[i+1]){
            	temp = x[i];
            	x[i] = x[i+1];
            	x[i+1] = temp;
        	}
    	}
    }

    int[] a = new int[20];
    int[] b = new int[20];
    int penguin = 0;

    boolean even = true;
    for(int i = 0; i<40; i++){
    	if(even==true){
    		a[penguin] = x[i];
    	}
    	else{
    		b[penguin] = x[i];
    		penguin++;
    	}
    	even=!even;
    }

    int added1 = a[0];
    int added2 = b[0];

    for(int i = 1; i<20; i++){
    	if(added1>0){
    		added1-= a[i];
    	}
    	else{
    		added1+=a[i];
    	}

    }

    for(int i = 1; i<20; i++){
    	if(added2>0){
    		added2-= b[i];
    	}
    	else{
    		added2+=b[i];
    	}
    }
    return(Math.abs(Math.abs(added1) - Math.abs(added2)));

}
}

