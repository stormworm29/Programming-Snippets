package rmipack;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RMIDemo extends UnicastRemoteObject implements Sebi1, SebiMaster{

    public RMIDemo() throws RemoteException{
    
    }
    
    public int getStockPrice(String name) throws RemoteException {
        
        if(name.equals("sirius")) {
            return 100;
        }
        else
            return 50;
    }
    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099);
        Naming.bind("rmi://localhost:1099/stock", new RMIDemo());  //give alias name stock and return new RMISERVER object
        System.out.println("server ready to server");
    }

    @Override
    public void accessMaster(String name) throws RemoteException {
    System.out.println("master here");
        
    }
}

interface Sebi1 extends Remote{ //all interfaces extend remote
    abstract int getStockPrice(String name) throws RemoteException;  //all method of interface extending remote throw
}

interface SebiMaster extends Remote{
    abstract void accessMaster(String name) throws RemoteException;
}