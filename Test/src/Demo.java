
interface Phone{
	
	public void call();
	default void text() {
		System.out.println("Sending Text");
	}
	
}

class AndroidPhone implements Phone{

	@Override
	public void call() {
		
		System.out.println("Calling"); 
	}
	
}
public class Demo {
	
	public static void main(String[] args) {
		Phone phone = new AndroidPhone();
		phone.call();
		phone.text();
		
	}

}
