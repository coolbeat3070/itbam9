package cmm02.op;

public class No01_DanHangDemo2 {
	
	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		
		j = i++;
		System.out.println("i �� �� : " + i);
		System.out.println("j = i++ �� �� : "+j);
		
		int x = 5;
		int y = 0;
		y = ++x;
		System.out.println("x �� �� : " + x);
		System.out.println("y = ++x �� �� : " + y);
		
		
	}
}
