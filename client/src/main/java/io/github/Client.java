package io.github;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {

    public static void main(String[] args) throws MalformedURLException {
        URL wsdlURL = new URL("http://localhost:8080/Service/Hello?wsdl");
        QName SERVICE_NAME = new QName("http://service.ws.sample/", "HelloService");
        Service service1 = Service.create(wsdlURL, SERVICE_NAME);
        Hello client = service1.getPort(Hello.class);
        System.out.println(client.sayHello("Ame"));
    }
}
