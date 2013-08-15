package com.java.basic.day18;

import java.util.Properties;

/*
	System:���еķ��������Զ��Ǿ�̬��;
	out:��׼���,Ĭ���ǿ���̨
	in:��׼����,Ĭ���Ǽ���
	
	����ϵͳһЩ��Ϣ
	��ȡϵͳ������Ϣ:Properties getProperties()
*/
public class SystemDemo {

	public static void main(String[] args) {
		Properties prop = System.getProperties();
		
		//��ΪProperties��Hashtable������,Ҳ����Map���ϵ�һ���������
		//��ô����ͨ��map����ȥ���ü����е�Ԫ��.
		//�ü����д洢�Ķ����ַ���,û�з���
		
		//�����ϵͳ�����Զ���һЩ���е���Ϣ?
		System.setProperty("myKey", "This is Sinbad.");
		
		//��ȡָ��������Ϣ
		String Info = System.getProperty("os.name");
		System.out.println("value = " + Info);
		
		//�ɲ�������jvm����ʱ,��̬����һЩ������Ϣ��?
		String v = System.getProperty("haha");
		System.out.println("v = " + v);
		
		//����ʹ��  java -Dhaha=ValueString ClassName
		
		for(Object obj:prop.keySet()){
			String value = (String)prop.get(obj);
			System.out.println(obj + " => " + value);
		}
		
		
		
	}
}
