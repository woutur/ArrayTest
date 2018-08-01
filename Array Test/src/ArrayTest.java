
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LedMatrix bla = new LedMatrix();
		bla.setArray(16, 16);
		bla.paint(0, 0, 2);
		bla.paint(3,  3,  1);
		bla.paint(6, 6, 3);
		bla.printIt();
	}

}
