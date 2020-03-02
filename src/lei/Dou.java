package lei;

public class Dou {

	int age ;
	String animal = "Dog";
	String color ;
	
	// __init__(self,name)
	public Dou(String name) {
		System.out.println("Actully i am a cat,my name is "+name);
	}
	
	//  setColor(self,itscolor)
	public void setColor(String itscolor) {
		
		 color = itscolor;
	}
	
	public static void haha() {System.out.println("hahahahaha22h");}
	
	
	public void objHaha(){System.out.println("hahahahahah111");}

	
	
	public static void /* 空虚的  */main(String[] args) {	/*
		我是多行注释
		*/
		
			System.out.println("My name is @@@NIU!!");
			Dou mydog = new Dou("Mimi");
			Dou.haha();
			mydog.objHaha();
			System.out.println(new Dou("Jack").animal);
	}

}
