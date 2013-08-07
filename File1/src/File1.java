import java.io.*;
public class File1 {
	public static void main(String[] args) throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		int sum=0;
		int[] a=new int[3];
		for(int i=0;i<3;i++)
			{System.out.println("请输入第"+(i+1)+"个整数：");
			a[i]=Integer.parseInt(br.readLine());
			sum=sum+a[i];
			}
		System.out.println("合计："+sum);
		System.out.println("平均:"+(sum/a.length));
		
		}
		}
