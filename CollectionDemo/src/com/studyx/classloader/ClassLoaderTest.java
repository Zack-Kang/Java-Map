package com.studyx.classloader;
/**
 * �������
 * 1��Java������п��԰�װ������������ϵͳĬ��������Ҫ���������ÿ��
 * �ฺ������ض�λ�õ��ࣺBootStrap,ExtClassLoader,AppClassLoader
 * 2���������Ҳ��java�࣬��������������ҲҪ������������أ���Ȼ�����е�һ����
 * ����������java�࣬������BootStrap
 * 3��Java������е����е�����������þ��и��ӹ�ϵ�����νṹ��������֯����ʵ����ÿ�������������ʱ��
 * ��ҪΪ��ָ��һ��������װ����������߲���ϵͳ��װ����Ϊ�丸���������
 * 
 * �������֮�丸�ӹ�ϵ�͹�Ͻ��Χͼ
 *   BootStrap  --------->  JRE/lib/rt.jar
 *       ^
 *       |
 * ExtClassLoader ------->  JRE/lib/ext/*.jar
 *       ^
 *       |
 * APPClassLoader ------->  CLASSPATHָ��������jar��Ŀ¼
 *��System classLoader)
 *       ^
 *       |
 * MyClassLoader / ItCastClassLoader --> �Լ�ָ������Ŀ¼
 *   
 * 
 * ���������ί�л���
 * ��java�����Ҫ����һ����ʱ������Ҫ�ɳ��ĸ��������ȥ�����أ�
 * 1�����ȵ�ǰ�̵߳��������ȥ�����߳��еĵ�һ���ࡣ
 * 2�����A����������B�࣬java�������ʹ�ü���A��ļ�����������B��
 * 3��������ֱ�ӵ���ClassLoader.loadClass()������ָ��ĳ���������ȥ����ĳ����
 * ÿ���������������ʱ������ί�и����ϼ��������
 * 1�������������������żû�м��ص��࣬�ص���������������������ز��ˣ����׳�ClassNotFoundException��
 * ������ȥ�ҷ�������������Ķ��ӣ���Ϊû��getChild��������ʹ�У���ô���������һ���أ�
 * 2��������������Ĳ��ͼ��ί�м���ԭ��������ǰ��ClassLoaderTest�����jre/lib/extĿ¼�µ�itcast.jar�������н��ΪExtClassLoader��ԭ��
 * 
 * 
 *
 */
public class ClassLoaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ClassLoaderTest.class.getClassLoader().getClass().getName());  //sun.misc.Launcher$AppClassLoader
		System.out.println(System.class.getClassLoader());  //null   Bootrap
		ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
		while(classLoader!=null){
			System.out.println(classLoader.getClass().getName());
			classLoader = classLoader.getParent();
		}
		System.out.println(classLoader);
		/**
		 * sun.misc.Launcher$AppClassLoader
		 * sun.misc.Launcher$ExtClassLoader
		 * null
		 */
		
	}

}
