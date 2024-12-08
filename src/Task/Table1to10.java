package Task;

public abstract class Table1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int o=1; o<=10; o++)
		{
			for (int i=2; i<=10; i++)
			{	
				int mult=o*i;
				if(mult>=10&&mult<100)
				{
				System.out.print( mult+" | ");
				}
				else if(mult<10)
				{
				System.out.print( mult+"  | ");
				}
				else if(mult>=100)
				{
				System.out.print( mult+"|");
				}
				
			}
			System.out.print("\n");
		}
		System.out.println("--------------------------------------------");
		

	}

}
