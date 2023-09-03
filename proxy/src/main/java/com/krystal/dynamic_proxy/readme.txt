动态代理：在程序的执行过程中，使用jdk的反射机制，创建代理对象，并动态的指定要代理目标类。
        换句话说：动态代理是一种创建java对象的能力，让你不用创建TaoBao类，就能创建代理类对象。

动态代理可以在不改变原来目标方法功能的前提下，可以在代理中增强自己的功能代码。
    用处列如：
         1.比如:你所在的项目中，有一个功能是其他人（公司的其它门，其它小组的人)写好的，你可以使用。
         GoNong.calss,GoNong gn = new GoNong(),gn.print () ;
         2.你发现这个功能,现在还缺点,不能完全满足我项目的需要。 我需要在gn.print()执行后，需要自
         己在增加代码.
         3.用代理实现gn.print()调用时，增加自己代码,而不用去改原来的GoNong文件。

    在静态代理中目标类很多时候,可以使用动态代理,避免静态代理的缺点。
    动态代理中目标类即使很多：
    1）代理类数量可以很少
    2）当你修改了接口中的方法时，不会影响代理类

    在java中，要想创建对象：
        1.创建类文件，java文件编译为class文件
        2.使用构造方法，创建类的对象

    动态代理的实现：
        1. jdk动态代理：使用java反射包中的类和接口实现动态代理的功能
            反射包java.lang.reflect，里面有三个类：InvocationHandler、Method、Proxy
        jdk动态代理要求目标必须有接口，否则用不了。

        2.CGLIB动态代理：cglib是第三方的工具库，创建代理对象。
            cglib的原理是继承，cglib通过继承目标类，创建他的子类，在子类中重写父类中同名的方法，
            实现功能的修改。
            因为cglib是继承，重写方法，所以要求目标类不能是final的，方法也不能是final的。

        cglib的要求目标类比较宽松能继承即可，cglib在很多框架中使用，比如mybatis，spring。

    jdk动态代理：
        1.反射，Method类，表示方法。类中的方法，通过Method可以执行某个方法。
        2.jdk动态代理的实现
            反射包java.lang.reflect，里面有三个类：InvocationHandler、Method、Proxy

            1)InvocationHandler（调用处理器） 接口：就一个方法invoke()
                invoke():表示代理对象要执行的功能代码。你的代理类要完成的功能就写在invoke()方法中。

            代理类完成的功能：
            1.调用目标方法，执行目标方法的功能
            2.功能增强，目标方法调用时，增加功能
            方法的原型：
            参数：Object proxy：jdk创建的代理对象，无需赋值。
                 Method method：目标类中的方法，jdk提供method对象的
                     Object[] args：目标类中方法的参数，jdk提供的
            public Object invoke(Object proxy, Method method, Object[] args);

            InvocationHandler接口：表示你的代理要干什么
            怎么用: 1.创建类实现接口InvocationHandler
                   2.重写invoke()方法，把原来静态代理中代理类要完成的功能，写在这里

            2)Method类：表示方法的，确切的说就是目标类中的方法。
            作用：通过Method可以执行某个目标类的方法，Method.invoke();
                method.invoke()(目标对象，方法的参数)
                Object ret = method.invoke(target, "李四");
            说明：method.invoke()就是用来执行目标方法的，等同于静态代理中的
                    //向厂家发送订单，告诉厂家，我要买u盘，厂家发货
                    float price = factory.sell(amount);

            3)Proxy类:核心的对象，创建代理对象。之前创建对象都是new类的构造方法（）
                现在我们是使用Proxy类的方法，代替new的使用。
            作用是：创建代理对象，等同于静态代理中的new TaoBao();

            参数：
            1.ClassLoader loader 类加载器，负责向内存中加载对象的，使用反射获取对象的classloader
                类Cat，Cat.getClass().getClassLoader(),目标对象的类加载器
            2.Class<?>[] interfaces：接口，目标对象实现的接口，也是反射获取的。
            3.InvocationHandler h ：我们自己写的，代理类要完成的功能。
            返回值：就是代理对象
            public static Object newProxyInstance(ClassLoader loader,
                                                  Class<?>[] interfaces,
                                                  InvocationHandler h)

        3.实现动态代理的步骤：
            1.创建接口，定义吗，目标类要完成的功能
            2.创建目标类实现接口
            3.创建InvocationHandler接口的实现类，在invoke方法中完成代理类的功能
                1）.调用目标方法
                2）.增强功能
            4.使用Proxy类的静态方法，创建代理对象。并把返回值转为接口类型。