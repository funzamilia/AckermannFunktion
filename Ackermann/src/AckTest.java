
public class AckTest {
	
	public static int ack(int x, int y) {
		if(x == 0) {
			return y + 1;
		} else if(y == 0) {
			return ack(x - 1, 1);
		} else {
			return ack(x - 1, ack(x, y - 1));
		}
	}

	public static void main(String[] args) {
		System.out.println(ack(3, 1));
	}

}
