package pingHost;

import java.io.IOException;
import java.net.InetAddress;
import java.util.GregorianCalendar;

public class Ping {
	InetAddress inetAddress = null;

	private String IPaddress;

	public Ping(String IPaddress) {

		this.IPaddress = IPaddress;
	}

	public void pingingTheHost() throws IOException {
		inetAddress = InetAddress.getByName(IPaddress);
		System.out.println("Sending Ping Request to " + IPaddress);
		long finish = 0;
		long start = new GregorianCalendar().getTimeInMillis();
		if (inetAddress.isReachable(5000)) {
			finish = new GregorianCalendar().getTimeInMillis();
			System.out.println("Ping RTT: " + (finish - start + "ms"));
		} else {

			System.out.println("IP Address not reachable");
		}

	}

}
