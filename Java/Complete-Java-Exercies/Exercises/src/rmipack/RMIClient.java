package rmipack;

import java.rmi.Naming;

public class RMIClient {
	public static void main(String[] args) throws Exception {
		Sebi1 sebi = (Sebi1)Naming.lookup("rmi://localhost:1099/stock");
	}
}
