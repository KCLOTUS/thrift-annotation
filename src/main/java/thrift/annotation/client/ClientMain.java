package thrift.annotation.client;

import com.facebook.nifty.client.FramedClientConnector;
import com.facebook.swift.service.ThriftClientManager;
import thrift.annotation.server.HelloService;
import thrift.annotation.server.User;

import java.net.InetSocketAddress;

public class ClientMain {

    public static void main(String [] args){
        ThriftClientManager clientManager = new ThriftClientManager();
        FramedClientConnector connector = new FramedClientConnector(new InetSocketAddress("localhost",8899));

        User user = new User();
        user.setName("bfy");
        user.setEmail("bfylu001@gmail.com");

        HelloService helloService = clientManager.createClient(connector, HelloService.class).get();
        String hi = helloService.sayHello(user);
        System.out.println(hi);
    }
}
