package com.interfaceproject;

import java.util.Random;

 class BSNL implements SIMInterface {
@Override
public long getPhoneNumber() {
	Random no=new Random();
	long phoneNum=no.nextLong(9180000000L,9999999999L);
	return phoneNum;
}
@Override
public void networkProvider() {
	System.out.println("Network provider : BSNL");
}
@Override
public void activation() {
	System.out.println("BSNL SIM activated");
}
@Override
public void deactivation() {
	System.out.println("BSNL SIM deactivated");
}

}

