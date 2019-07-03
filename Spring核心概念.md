# Spring核心概念

## 1.Spring 是什么

Spring是提供一站式服务，服务于表示层、控制器、业务逻辑层和数据访问层，Spring以高度开发性与已有的框架无缝整合

Spring是轻量级的IOC（控制反转）和AOP（面向切面编程）的容器框架

## 2.Spring优点

1.提倡不重复造轮子

2.为了降低开发企业级项目的复杂度

3.促进良好编程习惯

## 3.核心概念IOC

IOC（控制反转）：为了降低程序对象之间的耦合度，Spring把对象的创建和维护的控制权由应用程序转移到外部工场或容器，这样的控制权的转移称为控制反转

又称为DI（依赖注入）,spring启动时，spring会根据依赖对象的关系，将依赖的对象注入到组件中

1.下载spring3.2.13资源包，并把相关驱动包导入到当前的工程环境中

2.添加和配置spring的配置文件

3.使用IOC完成降低对象之间的耦合度，方式几种

### 依赖注入方式

#### １、设值注入：通过setter方法注入依赖对象

​	１.提供依赖属性的setter方法

```java
public class UserServiceImpl implements UserService{


    /**
     * 通过Spring 降低依赖关系
     */
    private UsersDao usersDao;

    public void setUsersDao(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public Users longinUser(String name, String pwd) {
        return usersDao.getUserByNamePWD(name, pwd);
    }
}
```

​	2.在容器中使用property进行设值注入

```xml
<!--设置注入-->
    <bean id="userDao" class="com.spring.dao.UserDaoImpl">

    </bean>

    <bean id="userService" class="com.spring.service.UserServiceImpl">
        <!--依赖的属性
        property name:setXXX xxx
        例如setUserDao userDao
        而不是属性名
        把上面的bean注入进来-->
        <property name="usersDao" ref="userDao"/>
    </bean>
```



#### ２、构造注入：通过构造函数

```xml
<bean class="com.spring.entity.Users" id="user">
        <constructor-arg value="1" index="0"/>
        <constructor-arg index="1" value="quzhidi"/>
        <constructor-arg index="2" value="000000"/>
        <constructor-arg index="3" ref="product"/>
        <constructor-arg index="4">
            <array value-type="java.lang.String">
                <value>1994123456778</value>
                <value>1994123456779</value>
                <value>1994123456780</value>
                <value>1994123456781</value>
                <value>1994123456782</value>
            </array>
        </constructor-arg>
    </bean>
```

![](C:\Users\QuLvT\Desktop\设值注入和构造注入的区别.png)

#### ３、ｐ命名空间注入

好处：减少配置量

​	1.引入p命名空间

​	2.根据语法注入

​	语法是：p:属性名

```xml
<bean id="user" class="com.spring.entity.Users" p:id="10" p:name="qu" p:pwd="0000" p:product-ref="product">
</bean>
```

## 4.核心概念AOP

AOP原理：

按复杂的需求分解出不同方面，将散布在系统中的公共功能集中解决

采用代理机制组装起来运行，在不改变原程序的基础上对代码段进行增强处理，增加新的功能

Spring AOP应用

### 1.切点：

增强多个方法：方法的集合称为一个Pointcut

每一个方法称为一个连接点，连接点的集合称为一个切点

### 2.通知：

什么时候增强方法，切入连接点的时机和内容

​	前置增强

​	后置增强

​	异常增强

​	环绕增强

​	最终增强

### 3.切面

切点和通知所在的类称为切面，即切面=通知+切点

1.@EnableAspectJAutoProxy:启用AspectJ支持

### 4.连接点

连接点就是个方法



​	