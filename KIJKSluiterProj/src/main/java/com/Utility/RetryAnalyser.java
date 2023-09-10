package com.Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class RetryAnalyser implements IRetryAnalyzer {
//providing test cases for multiple times
	int retrycount=0;
	int maxretrycount=3;
	@Override
	public boolean retry(ITestResult result) {
		
		if(retrycount<maxretrycount) {
			System.out.println(result.getName()+"with status"+getResultStatusName(result.getStatus())
			+"for the "+(retrycount+1));
			retrycount++;
			return true;
		}
		return false;
	}

	
	public String getResultStatusName(int status) {
		String resultName = null;
		if(status==1) {
			resultName="Success";
		}
		if(status==2) {
			resultName="Failure";
		}
		if(status==3) {
			resultName="Skip";
		}
		
		return resultName;
	}
}
