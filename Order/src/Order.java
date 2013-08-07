
public class Order {
	public int a[];
	
	int[] GenerateArray( )  //产生10个元素的数组
	{int[] b=new int[10];
	for(int m=0;m<b.length;m++)
	{b[m]=(int)(Math.random()*10);}
	return b;
	}
	
	int[] Sort(int b[])	//对数组进行冒泡排序
	{int t=0;
	int n=b.length;
	for(int i=0;i<n-1;i++)
		for(int j=0;j<n-i-1;j++)
		{if (b[j]>b[j+1])
		{
			    t=b[j];
				b[j]=b[j+1];
				b[j+1]=t;
				}
		}
	return b;
	}
	
	void PrintArray(int b[])  //打印数组
	{for(int k=0;k<b.length;k++)
	{ System.out.print(b[k]+" ");
	}
	System.out.println();}
	
public static void main(String[] args) {
	
		Order or1= new Order();
		
	    or1.a=or1.GenerateArray();
		or1.PrintArray(or1.a);
		or1.a=or1.Sort(or1.a);
		or1.PrintArray(or1.a);
}
		

}
