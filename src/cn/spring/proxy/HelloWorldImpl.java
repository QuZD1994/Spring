package cn.spring.proxy;

public class HelloWorldImpl implements HelloWorld{
    @Override
    public void sayHelloWorld() {
        System.out.println("Hello world");
    }
}
