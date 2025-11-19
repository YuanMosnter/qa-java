# 异常
Java规定：

必须捕获的异常，包括Exception及其子类，但不包括RuntimeException及其子类，这种类型的异常称为Checked Exception。
不需要捕获的异常，包括Error及其子类，RuntimeException及其子类。
```plantuml
第一部分：必须捕获的异常（Checked Exception）
包括：Exception类及其子类，但排除RuntimeException及其子类。
意思：这些异常是“可预见、可恢复”的，比如文件读写错（IOException）、SQL语法错（SQLException）。Java规定：编译时必须处理（try-catch 或 throws声明），不然代码不编译通过。
为什么叫Checked？ 编译器“检查”你有没有处理，像机场安检——必须过关。例：FileInputStream读文件，抛FileNotFoundException（Checked），你得catch住。
执行流程：写方法时，遇到Checked异常，IDE红灯：必须加throws传给上层，或try-catch本地消化。

第二部分：不需要捕获的异常（Unchecked Exception）
包括：Error及其子类（如OutOfMemoryError——内存爆了，JVM自己扛）；RuntimeException及其子类（如NullPointerException——空指针，ArrayIndexOutOfBoundsException——数组越界）。
意思：这些是“不可预见或不值得恢复”的运行时炸弹。Java不强制捕获——编译通过，任它运行时抛。为什么？捕获了也难救（比如内存溢出，重启吧）。
Unchecked的本质：运行时才check，像开车不系安全带——出事了再说。例：String s = null; s.length(); 抛NullPointerException，编译OK，运行崩。
```

## 多个catch
捕获异常时，多个catch语句的匹配顺序非常重要，子类必须放在前面;
finally语句保证了有无异常都会执行，它是可选的；
一个catch语句也可以匹配多个非继承关系的异常。

# 常见的异常
Exception
├─ RuntimeException
│  ├─ NullPointerException
│  ├─ IndexOutOfBoundsException
│  ├─ SecurityException
│  └─ IllegalArgumentException
│     └─ NumberFormatException
├─ IOException
│  ├─ UnsupportedCharsetException
│  ├─ FileNotFoundException
│  └─ SocketException
├─ ParseException
├─ GeneralSecurityException
├─ SQLException
└─ TimeoutException