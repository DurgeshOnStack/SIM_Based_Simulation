package com.interfaceproject;

public interface MobilePhone {
public void insertSim(SIMInterface sim); 
	public void removeSim();
	  public void makeCall(long phoneNum);
	   public void sendMsg(long phoneNum, String txt);

}
