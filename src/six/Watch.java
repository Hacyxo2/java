package six;

public class Watch extends Thing implements Valueable {
	String brand;
	public Watch(String b) {
		super("�ð�");
		this.brand = b;
	}
	public int value() {
		return 10000;
	}
}
