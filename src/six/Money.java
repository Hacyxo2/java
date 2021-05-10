package six;

public class Money extends Thing implements Valueable{
	int value;
	public Money(int value){
		super("µ·");
		this.value = value;
	}
	public int value() {
		return value;
	}
}
