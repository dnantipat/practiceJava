package proxyPattern;

public class Main {

	public static void main(String[] args) {
		Image image1 = new ProxyImage("image 1");
		Image image2 = new ProxyImage("image 2"); 
		image1.display();
		image2.display();
		image1.display();
		
	}

}
