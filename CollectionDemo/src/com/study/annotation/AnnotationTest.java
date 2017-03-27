package com.study.annotation;

@ItcastAnnotation(annotationAttr=@MetaAnnotation("fix"),color="red",value="abc",arrayAttr={1,2,3})
public class AnnotationTest {

	@ItcastAnnotation("abb")   //color�Ѿ�����Ĭ��ֵ�����Բ���д"value="ֻ��value��������
	//@SuppressWarnings("deprecated")   //���ֻ��value������Ҫ��ֵʱ�����Բ�д"value="
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (AnnotationTest.class.isAnnotationPresent(ItcastAnnotation.class)){
			ItcastAnnotation annotation = AnnotationTest.class.getAnnotation(ItcastAnnotation.class);
			System.out.println(annotation.color());
			System.out.println(annotation.value());
			System.out.println(annotation.arrayAttr().length);
			System.out.println(annotation.annotationAttr().value());
		}
		
		sayHell();
		
	}
	
	/**
	 * @Deprecated
	 * ��ע������ú����ѹ��ڣ�������ʹ��
	 */
	@ItcastAnnotation(annotationAttr=@MetaAnnotation("fix"),color="red",value="abc",arrayAttr=2)   //�������������ֻ��һ��ֵ����ô����ʡ�Դ�����
	@Deprecated
	public static void sayHell(){
		
	}

}
