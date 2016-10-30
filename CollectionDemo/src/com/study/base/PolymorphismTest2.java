package com.study.base;
/**
 * �������ݿ����
 * ����ʱ���û���Ϣ
 * 1���������ݿ�  JDBC Hibernate
 * 2���������ݿ�
 *    c create r read u update d delete
 * 3���ر����ݿ�����
 * 
 * 
 * 
 * 
 * class UserInfoByJDBC{
 * 		public void add(User user){
 * 			1��JDBC�������ݿ�
 * 			2��ʹ��sql�������
 * 			3���ر�����
 * 		}
 * 
 * 		public void delete(User user){
 * 			1��JDBC�������ݿ�
 * 			2��ʹ��sql���ɾ������
 * 			3���ر�����	
 * 		}
 * }
 * 
 * class UserInfoByHibernate{
 * 		public void add(User user){
 * 			1��Hibernate�������ݿ�
 * 			2��ʹ��sql�������
 * 			3���ر�����
 * 		}
 * 
 * 		public void delete(User user){
 * 			1��Hibernate�������ݿ�
 * 			2��ʹ��sql���ɾ������
 * 			3���ر�����	
 * 		}
 * }
 * 
 * 		*
 * 		*
 * 		*
 * 		V
 * 
 * Interface UserInfoDao{
 * 		public void add(User user);
 * 		public void delete(User user)
 * }
 * 
 * class UserInfoByJDBC implements UserInfoDao{
 * 		public void add(User user){
 * 			1��JDBC�������ݿ�
 * 			2��ʹ��sql�������
 * 			3���ر�����
 * 		}
 * 
 * 		public void delete(User user){
 * 			1��JDBC�������ݿ�
 * 			2��ʹ��sql���ɾ������
 * 			3���ر�����	
 * 		}
 * }
 * 
 * class UserInfoByHibernate implements UserInfoDao{
 * 		public void add(User user){
 * 			1��Hibernate�������ݿ�
 * 			2��ʹ��sql�������
 * 			3���ر�����
 * 		}
 * 
 * 		public void delete(User user){
 * 			1��Hibernate�������ݿ�
 * 			2��ʹ��sql���ɾ������
 * 			3���ر�����	
 * 		}
 * }
 * 
 * class DBOperate{
 * 		public static void main(String[] args){
 * 			//UserInfoByJDBC ui = new UserInfoByJDBC();
 * 			//ui.add(user);
 * 			UserInfoDao ui = new UserInfoByHibernate();
 * 			ui.add(user);
 * 		}
 * 
 * 		
 * 
 * 		
 * 
 * 
 * 
 * 
 */

import static java.lang.System.*;

class MainBoard{
	public void run(){
		out.println("MainBoard run");
	}
}



public class PolymorphismTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainBoard m = new MainBoard();
		m.run();
		
	}
}
