import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		int top = ray.length-1;
        int bottom = 0;
        int guess = (top+bottom)/2;
        boolean found = false;

		Arrays.sort(ray);

		while ((!found) && (top != bottom))
		{
			if(ray[guess] == item)
				found = true;
			else if(ray[guess] < item)
				bottom = guess;
			else if(ray[guess] > item)
				top = guess;

			guess = (top+bottom)/2;
		}

		if(!found)
			guess = -1;

		return guess;



	}
}
