- 用继承Thread类的方法进行多线程设计。
  - 第一个线程LeapThread的功能为：判断2000至2100年之间的每个数，如果该数是闰年，则输出该数。每判断一次，暂时休眠若干毫秒。
  - 第二个线程PrimeThread的功能为：判断100至200年之间的每个数是否是质数，如果该数是质数，则输出该数。每判断一次，暂时休眠若干毫秒。
  - 第三个线程用于输出1到10的阶乘 
  - 编写一个Java应用程序，测试这三个线程。
- 用Runnable接口的方法进行多线程设计。
  - 第一个线程LeapThread的功能为：判断2000至3000年之间的每个数是否是闰年，每判断一次，暂时休眠若干毫秒。
  - 第二个线程Thread2的功能为：判断100至200年之间的每个数是否能够被3整除，能则输出该数。每判断一次，暂时休眠若干毫秒。
  - 第三个线程线程PrimeThread的功能为：判断100至200年之间的每个数是否是质数，如果该数是质数，则输出该数。每判断一次，暂时休眠若干毫秒。
  - 测试这三个线程