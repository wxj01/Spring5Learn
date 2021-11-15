#spring5 学习
##spring的基础学习
~~~markdown
1.进行基础的学习，通过系统学习，在慢慢深入源码的学习，目的是达到手写简易的spring框架
~~~

###笔记
~~~markdown
单例bean使用注意

单例bean是整个应用共享的，所以需要考虑到线程安全问题，之前在玩springmvc的时候，springmvc中controller默认是单例的，有些开发者在controller中创建了一些变量，那么这些变量实际上就变成共享的了，controller可能会被很多线程同时访问，这些线程并发去修改controller中的共享变量，可能会出现数据错乱的问题；所以使用的时候需要特别注意。


多例bean使用注意

多例bean每次获取的时候都会重新创建，如果这个bean比较复杂，创建时间比较长，会影响系统的性能，这个地方需要注意。

下面要介绍的3个：request、session、application都是在spring web容器环境中才会有的。


spring容器自带的有2种作用域，分别是singleton和prototype；还有3种分别是spring web容器环境中才支持的request、session、application

singleton是spring容器默认的作用域，一个spring容器中同名的bean实例只有一个，多次获取得到的是同一个bean；单例的bean需要考虑线程安全问题

prototype是多例的，每次从容器中获取同名的bean，都会重新创建一个；多例bean使用的时候需要考虑创建bean对性能的影响

一个应用中可以有多个spring容器

自定义scope 3个步骤，实现Scope接口，将实现类注册到spring容器，使用自定义的sope


~~~

~~~markdown
参数名称可能不稳定的问题，spring提供了解决方案，通过ConstructorProperties注解来定义参数的名称，将这个注解加在构造方法上面
~~~

~~~markdown
<bean id="bean1" class="" depend-on="bean2,bean3; bean4" />

depend-on：设置当前bean依赖的bean名称，可以指定多个，多个之间可以用”,;空格“进行分割

上面不管bean2,bean2,bean4在任何地方定义，都可以确保在bean1创建之前，会先将bean2,bean3,bean4创建好，表示bean1依赖于这3个bean，可能bean1需要用到bean2、bean3、bean4中生成的一些资源或者其他的功能等，但是又没有强制去在bean1类中通过属性定义强依赖的方式去依赖于bean2、bean3、bean4；当然销毁的时候也会先销毁当前bean，再去销毁被依赖的bean，即先销毁bean1，再去销毁depend-on指定的bean

~~~