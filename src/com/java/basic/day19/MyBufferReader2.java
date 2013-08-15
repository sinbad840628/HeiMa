package com.java.basic.day19;
/*
 MyReader //专门用于读取数据的类。
 	|--MyTextReader  (生成不同类型的自定义Reader)
 		|--MyBufferTextReader
 	|--MyMediaReader
 		|--MyBufferMediaReader
 	|--MyDataReader
 		|--MyBufferDataReader
 
 
 	class MyBufferReader{
 	
 		MyBufferReader(MyTextReader text){}
 		MyBufferReader(MyMediaReader media){}
 		MyBufferReader(MyBufferDataReader data){}
 		.
 		.
 		.
 		.
 		这样的话，会累死的。。
 	}
 	上面的方法扩展性很差。
 	找到其参数的共同类型，通过多态的形式，可以提高扩展性。
 	
 
 
 	class MyBufferReader extends MyReader
 	{
 		MyBufferReader(MyReader r)
 		{}
 	}
 
 	优化后的体系：
 	
 	MyReader //专门用于读取数据的类。
 	|--MyTextReader  (生成不同类型的自定义Reader)
 	|--MyMediaReader
 	|--MyDataReader
 	
 	|--MyBufferReader (优化型Reader，他没有什么东西，只是基于原先的类)
 	
 	
 	装饰模式比继承要灵活，避免了继承体系的臃肿。
 	而且降低了类与类之间的关系。
 	
 	装饰类因为增强已有对象，具备的功能和已有的是相同的，只不过提供了更强功能。
 	所以装饰类和被装饰类通常都属于一个体系中的。
 
 */
public class MyBufferReader2 {

}
