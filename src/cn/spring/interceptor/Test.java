package cn.spring.interceptor;

import cn.spring.proxy.HelloWorld;
import cn.spring.proxy.HelloWorldImpl;

public class Test {

    public static void main(String[] args) {
        HelloWorld proxy = (HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(), "cn.spring.interceptor.MyInterceptor");
        proxy.sayHelloWorld();
    }
}
