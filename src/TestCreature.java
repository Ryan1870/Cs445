import java.util.ArrayList;

public class TestCreature {

	public static void main(String[] args) {
		
		final int THING_COUNT = 2;
		
		Thing[] arry = new Thing[THING_COUNT];
		
		for(int i = 0; i <= THING_COUNT; i++)
		{
			Thing thg = new Thing("name");
			arry[i] = thg;
		}

		for(int j = 0; j <= THING_COUNT; j++)
		{
			System.out.println(arry[j]);
		}
	}

}

