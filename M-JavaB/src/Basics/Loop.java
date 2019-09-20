package Basics;

public class Loop {
	
	// for cuando tenemos un numero exacto, corrida controlada, while cuanod no se tiene el numero exacto de corridas, cuando 
	//el incre/decr no es constante

	public void printTable(int input) 
	{
		for(int i=1;i<10;i++)
		{
			System.out.println(input +  "*"  +  i   + "="  + i*input);
		}
	}
	
	public void printTableWhile(int input)
	{
		int i =1;
		while(i<input)
		{
			System.out.println(i);
			i++;
		}
	}
	
	
	// do while (exit control loop), cuando queremos hacer la task al menos una vez, ejecuta la task luego controla
	
	public void doWhile(int input)
	{
		int i=1;
		do
		{
			System.out.println(input + "*" + i  + "="  + i*input);
			i++;
	
		}while(i<=10);
	}
	
	//for each loop, cuando tenemos set of data, como array,list,set,map....
	
	public void forEach()
	{
		int [] arrayNumber = {1,5,55,84,22,65};
		int size = arrayNumber.length;
		for(int i : arrayNumber)
		{
			System.out.println(i);
		}
	}
	
	
		//task generate fibonacci series
	public void fibonacci(int limit)
	{
		int first = 0;
		int second = 1;
		int last = 0;
		System.out.println(first);
		System.out.println(second);
		
		for (int i=1;i<limit;i++)
			{
				if(last<=limit)
				{
					last = first+second;
					System.out.println(last);
					first=second;
					second=last;
				}			
			}			
	}
}
