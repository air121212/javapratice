import java.io.*;
public class File1 {
	public static void main(String[] args) throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		int sum=0;
		int[] a=new int[3];
		for(int i=0;i<3;i++)
			{System.out.println("�������"+(i+1)+"��������");
			a[i]=Integer.parseInt(br.readLine());
			sum=sum+a[i];
			}
		System.out.println("�ϼƣ�"+sum);
		System.out.println("ƽ��:"+(sum/a.length));
		
		}
		}
