package com.java.basic.day14;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo1 {

	public static void main(String[] args) {
		
		method_get();
	}
	
	public static void method_02(){
		ArrayList  al1 = new ArrayList();		
		//1.���Ԫ��
		al1.add("Java01");
		al1.add("Java02");
		al1.add("Java03");
		al1.add("Java04");
		
		ArrayList  al2 = new ArrayList();		
		//1.���Ԫ��
		al2.add("Java03");
		al2.add("Java04");
		al2.add("Java05");
		al2.add("Java06");
		
		//al1.retainAll(al2); //ȥ������al1��ֻ�ᱣ�����ڵġ�û�н�����ʲôҲû�У���ȡ�����õģ������ڸı����ݵ����顣
		al1.removeAll(al2);
		sop(al1);
		sop(al2);
	}
	
	public static void base_method(){
		//����һ������������ʹ��Collection�ӿڵ����࣬ArrayList
		
				ArrayList  al = new ArrayList();
				
				//1.���Ԫ��
				al.add("Java01");
				al.add("Java02");
				al.add("Java03");
				al.add("Java04");
				
				//��ӡ �ı�ǰ�ļ���
				sop(al);
				
				//3. ɾ������
				//al.remove("Java02");
				//��ռ���
				al.clear();
				
				//��ӡ �ı�ǰ�ļ���
				sop(al);
				
				//2.��ȡ���ϳ���
				sop("Size: "+ al.size());
				
				//4.�ж�Ԫ��
				sop("Java03 �Ƿ���ڣ�" + al.contains("Java03"));
				sop("Java�����Ƿ�Ϊ�գ�" + al.isEmpty());
	}
	
	public static void method_get(){
		
		//Iterator �ӿڣ��������������ü򵥰�������
		
		ArrayList  al1 = new ArrayList();		
		//1.���Ԫ��
		al1.add("Java01");
		al1.add("Java02");
		al1.add("Java03");
		al1.add("Java04");
		
		Iterator it = al1.iterator();

		while ( it.hasNext()) {
			sop(it.next());			
		}
		
		for(Iterator itr = al1.iterator(); itr.hasNext();){
			sop(itr.next());		
		}
	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
