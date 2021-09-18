import java.lang.StringBuilder;
import java.util.stream.Stream;
public class Concat {

	
	
	static String concat(String [] strings)
	{
		StringBuilder sb = new StringBuilder();
		for(String s : strings)
		{
			sb.append(s);
	
		}
		
	return sb.toString();
	}
	
	public static void main(String[] args) {
		String[] strings = Stream.of("First", "Second", "Third").toArray(String[]::new);

	    String[] str = new String[]{"a","aa","bcc","f", "o", "o","bar"};
		System.out.println(Concat.concat(strings)); 
		System.out.println(Concat.concat(str));
	}

}
