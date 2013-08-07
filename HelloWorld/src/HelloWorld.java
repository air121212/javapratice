
public class HelloWorld {
	
	static void whatclass(Object obj)
	{if(obj instanceof String)
		System.out.println("String:"+obj);
	else if (obj instanceof Boolean)
		System.out.println("Boolean:"+obj);
	else if (obj instanceof Integer)
		System.out.println("Integer:"+obj);
	else if (obj instanceof Double)
	System.out.println("Double:"+obj);}
	
	public static void main(String[] args) {
		
		whatclass("abc");
		whatclass(new Boolean(true));
		whatclass(new Integer(10));
		whatclass(new Double(5.5));
		whatclass(10);
		whatclass(5.5);
		whatclass(false);

}
}