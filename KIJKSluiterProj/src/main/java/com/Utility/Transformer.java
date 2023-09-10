package com.Utility;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class Transformer implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(RetryAnalyser.class);
		
		 Class<? extends IRetryAnalyzer> analyser = annotation.getRetryAnalyzerClass();
		
		if(analyser==null) {
			
			annotation.setRetryAnalyzer(RetryAnalyser.class);
		}
	}

	
}
