package pingHost;

import java.io.IOException;
import java.util.Scanner;

public class PingTheHost {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the IP Address to be pinged (xxx.xxx.xxx.xxx):");
		String IpAddress = sc.nextLine();
		sc.close();
		Ping test = new Ping(IpAddress);
		test.pingingTheHost();

	}

}
