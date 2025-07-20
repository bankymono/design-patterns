package state;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionUID = 1L;

    protected MyRemoteImpl() throws RemoteException, MalformedURLException {
    }

    @Override
    public String sayHello() throws RemoteException {
        String word = "wod";
        return "";
    }



    try{
        MyRemote service = new MyRemoteImpl();
        Naming.rebind("RemoteHello", service);
    } catch(Exception ex){
        throw new RuntimeException(ex);
    }


    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
