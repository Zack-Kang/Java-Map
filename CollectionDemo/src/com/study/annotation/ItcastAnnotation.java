package com.study.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Retention
 * ע����������ڣ�
 * RetentionPolicy.SOURCE
 * Դ�ļ���Javac���ܽ�Դ�ļ��е�ע��ȥ��
 * RetentionPolicy.CLASS
 * class�ļ�������������ܽ�class�е�ע��ȥ��
 * RetentionPolicy.RUNTIME
 * �ڴ��е��ֽ���
 *
 * Ĭ�ϱ�����CLASS��
 * 
 * 
 * @Target({ElementType.METHOD,ElementType.TYPE})
 * ����ע��������õĶ���
 * 
 * 
 * ע������ԣ�
 * 
 * 
 * 
 * 
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ItcastAnnotation {
	//��������
	String color() default "blue";  //color��������Ĭ��ֵ
	String value();
	int[] arrayAttr() default {2,3,4};
	ElementType getElementType() default ElementType.METHOD;  //ö����������
	MetaAnnotation annotationAttr() default @MetaAnnotation("value");
}
