package com.java.Exception;

public class AgeInvalidException extends Exception {
	private String Message;
	 AgeInvalidException(String Message){
		 this.Message=Message;
	 }
	 @Override
	 public String toString() {
		 return Message;
	 }
}
