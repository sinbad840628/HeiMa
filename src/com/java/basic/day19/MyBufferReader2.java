package com.java.basic.day19;
/*
 MyReader //ר�����ڶ�ȡ���ݵ��ࡣ
 	|--MyTextReader  (���ɲ�ͬ���͵��Զ���Reader)
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
 		�����Ļ����������ġ���
 	}
 	����ķ�����չ�Ժܲ
 	�ҵ�������Ĺ�ͬ���ͣ�ͨ����̬����ʽ�����������չ�ԡ�
 	
 
 
 	class MyBufferReader extends MyReader
 	{
 		MyBufferReader(MyReader r)
 		{}
 	}
 
 	�Ż������ϵ��
 	
 	MyReader //ר�����ڶ�ȡ���ݵ��ࡣ
 	|--MyTextReader  (���ɲ�ͬ���͵��Զ���Reader)
 	|--MyMediaReader
 	|--MyDataReader
 	
 	|--MyBufferReader (�Ż���Reader����û��ʲô������ֻ�ǻ���ԭ�ȵ���)
 	
 	
 	װ��ģʽ�ȼ̳�Ҫ�������˼̳���ϵ��ӷ�ס�
 	���ҽ�����������֮��Ĺ�ϵ��
 	
 	װ������Ϊ��ǿ���ж��󣬾߱��Ĺ��ܺ����е�����ͬ�ģ�ֻ�����ṩ�˸�ǿ���ܡ�
 	����װ����ͱ�װ����ͨ��������һ����ϵ�еġ�
 
 */
public class MyBufferReader2 {

}
