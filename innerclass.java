import java.util.*;
class Cpu
{
	int price;
	class processor
	{
		int core;
		String manufacture;
		processor(int core,int p1,String manufacture)
		{
			this.core=core;
			this.manufacture=manufacture;
			price=p1;
		}
		void display1()
		{
			System.out.println("no of cores="+core);
			System.out.println("name of manufacture="+manufacture);
			System.out.println("price="+price);
		}
	}
	void display2(int x,int z,String y)
		{
			int a=x;
			int c=z;
			String b=y;
			processor p=new processor(a,z,b);	
			p.display1();
			ram.disp();
			
		}
	static class ram
	{
		static int memory=4;
		static String manufacture="intel";
		static void disp()
		{
			System.out.println("memory storage="+memory);
			System.out.println("manufacture="+manufacture);
		}
	}
}
class innerclass
{
	public static void main(String args[])
	{
		int n,p;
		String man;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no of cores of the cpu:");
		n=s.nextInt();
		System.out.print("Enter the price of the cpu:");
		p=s.nextInt();
		man=s.nextLine();
		System.out.print("Enter the manufacture name:");
		man=s.nextLine();
		Cpu c=new Cpu();
		c.display2(n,p,man);				
	}
}
       
