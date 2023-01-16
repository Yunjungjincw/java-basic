import java.util.Scanner;

public class FlowEx {

	public static void main(String[] args) {
		System.out.print("문자를 입력하세요=");
		Scanner scanner = new Scanner(System.in);
		int siba = scanner.nextInt();
		
		switch(siba) {
		case 1: 
			System.out.println("sibal");
			break;
		case 2:
			System.out.println("Ssibal");
			break;
		}

	}

}
