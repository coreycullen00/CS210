import java.util.*;
public class subsetSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int items = sc.nextInt();
		int[] contents = new int[items];
		contents[0] = 1620243245;
        contents[1] = 676519318;
        contents[2] = 1448562316;
        contents[3] = 588259083;
        contents[4] = 1657685952;
        contents[5] = 1259243075;
        contents[6] = 1249333865;
        contents[7] = 701357539;
        contents[8] = 1124032684;
        contents[9] = 1281294568;
        contents[10] = 1739829499;
        contents[11] = 1715575050;
        contents[12] = 243385769;
        contents[13] = 1476128934;
        contents[14] = 940227405;
        contents[15] = 1234289694;
        contents[16] = 157034931;
        contents[17] = 1181964935;
        contents[18] = 781134463;
        contents[19] = 224137457;
        contents[20] = 1582237767;
        contents[21] = 956184431;
        contents[22] = 1024094177;
		
        for(int i = 23; i<items;i++){
	       contents[i] =rd.nextInt(900000000)+100000000;
	}
		
		char[] solution = solve(contents);
		long subset1 = 0;
		long subset2 = 0;

		for(int i = 0; i < items-1; i++)
		{
			if(solution[i]=='-')
			{
				subset1+= contents[i];

			}
			else
			{
				subset2+=contents[i];
			}
			System.out.println(contents[i]);
		}
		System.out.println(Math.abs(subset1-subset2));
	}
	public static char[] solve(int[]contents)
	{
		int[] copy = contents;
		char[] sign = new char[copy.length];
		int[] index = new int[copy.length];

		//fill sign with + (Default)and fill index array
		for(int i = 0; i < contents.length;i++)
		{
			index[i] = i;
			sign[i] = '+';
		}

		//resort copy from largest to smallest, sorting index array also to keep track
		int temp =0;
		int tempIndex = 0;
	    for(int pass = 0; pass < copy.length-1; pass++){
		    for(int i = 0; i < copy.length-1;i ++){
		        if(copy[i] < copy[i+1]){
		            temp = copy[i];
		            tempIndex = index[i];
		            copy[i] = copy[i+1];
		            index[i] = index[i+1];
		            copy[i+1] = temp;
		            index[i+1] = tempIndex;
		        }
		    }
	    }
	    int res = copy[0];//max value
	    for(int i = 1; i < copy.length;i++)
	    {
	        if(res>=0)
	        {
	            res-=(copy[i]);
	            sign[i] = '-';
	        }
	        else
	        {
	            res+=(copy[i]);
	        }
	    }

	    //resort array
	    //resort index and reorder the signs
	    char tempsign =' ';
		tempIndex = 0;
	    for(int pass = 0; pass < copy.length-1; pass++){
		    for(int i = 0; i < copy.length-1;i ++){
		        if(index[i] > index[i+1]){
		            tempIndex = index[i];
		            tempsign = sign[i];
		            index[i] = index[i+1];
		            sign[i] = sign[i+1];
		            index[i+1] = tempIndex;
		            sign[i+1] = tempsign;
		        }
		    }
	    }
	    return sign;
	}
}