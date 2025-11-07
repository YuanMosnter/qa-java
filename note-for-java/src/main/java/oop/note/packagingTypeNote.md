# 包装类型
基本类型
- byte
- short
- int
- long
- boolean
- float
- double
- char

引用类型可以赋值为null，基本类型不能是null
- 所有的class类
- interface类型
# 自动拆包&自动装包
因为int和Integer可以互相转换：
```java
int i = 100;
Integer n = Integer.valueOf(i);
int x = n.intValue();
```

所以，Java编译器可以帮助我们自动在int和Integer之间转型：
```java
Integer n = 100; // 编译器自动使用Integer.valueOf(int)
int x = n; // 编译器自动使用Integer.intValue()
```
## 不变类
所有包装类型得类都是不变类

```
基本类型	对应的引用类型
boolean	java.lang.Boolean
byte	java.lang.Byte
short	java.lang.Short
int	java.lang.Integer
long	java.lang.Long
float	java.lang.Float
double	java.lang.Double
char	java.lang.Character

```
最佳实践

按照语义编程，而不是针对特定的底层实现去“优化”。

创建新对象时，优先选用静态工厂方法而不是new操作符。

# 小结
Java核心库提供的包装类型可以把基本类型包装为class；

自动装箱和自动拆箱都是在编译期完成的（JDK>=1.5）；

装箱和拆箱会影响执行效率，且拆箱时可能发生NullPointerException；

包装类型的比较必须使用equals()；

整数和浮点数的包装类型都继承自Number；

包装类型提供了大量实用方法。