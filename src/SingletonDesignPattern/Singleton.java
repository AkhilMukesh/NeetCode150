package SingletonDesignPattern;

public class Singleton {
	//lazy intitalization 
	//to to early intialization we need new Singleton object which is thread safe version 
	private static Singleton singleton;

	
	private Singleton() {
		System.out.println("Hello from Singleton class");
	}
	
	public static Singleton getInstance() {
		if(singleton==null) {
			System.out.println("Before Instaition");
			return singleton =  new Singleton();
		}
		
		System.out.println("After instatioaton");
		return singleton;
	}
	
	
	public class SinglePatternExample {
		public static void main(String args[]) {
			
			Singleton singleton = Singleton.getInstance();
			Singleton singleton1 = Singleton.getInstance();
			Singleton singleton2 = Singleton.getInstance();
			
			
		}
	}	
}


