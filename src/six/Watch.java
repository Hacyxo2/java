package six;

public class Watch extends Thing implements Valueable {
	String brand;
	public Watch(String b) {
		super("½Ã°è");
		this.brand = b;
	}
	public int value() {
		return 10000;
	}
}
