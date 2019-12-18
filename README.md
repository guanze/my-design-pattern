# my-design-pattern

Singleton 单例模式：
<br/>1、只要求生成一个对象，比如一个班只有一个班长
<br/>2、对象需要被共享，例如配置对象或者数据库连接池等
<br/>3、某个类被频繁实例化，并且频繁被销毁的时候，多线程的线程池、网络连接池等
<br/><br/>（单例模式可扩展为有限的多例模式Multitcm，即生成多个实例的List，供用户随机获取调用）
<br/><br/>

ProtoType 原型模式：
<br/>1、两个对象实例化时有大量属性相同，只有极个别属性不同，此时可以用原型模式来简化逻辑，例如奖状，可以生成一个原型，然后对每个clone的实例填充人名和年份即可
<br/>2、当创建过程比较麻烦，而复制相对比较简单的时候
<br/><br/>（原型模式可以扩展为原型管理器，使用HashMap保留多个原型，比如Circle、Square实现Shape接口，Shape继承Cloneable接口，使用HashMap保留Circle和Square原型）
<br/><br/>
