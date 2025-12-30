package com.interfaceproject;

import java.util.Random;

 class Airtel implements SIMInterface {
@Override
public long getPhoneNumber() {
	Random no=new Random();
	long phoneNum=no.nextLong(9180000000L,9999999999L);
	return phoneNum;
}
@Override
public void networkProvider() {
	System.out.println("Network provider : Airtel");
}
@Override
public void activation() {
	System.out.println("Airtel SIM activated");
}
@Override
public void deactivation() {
	System.out.println("Airtel SIM deactivated");
}

}
