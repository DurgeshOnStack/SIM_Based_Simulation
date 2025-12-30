package com.interfaceproject;

 class Samsung implements MobilePhone{
private SIMInterface sim;
@Override
public void insertSim(SIMInterface sim) {
	if(this.sim==null) {
		this.sim=sim;
		sim.activation();
		System.out.println("SIM is inserted ");
		System.out.println("Your phone number is : "+sim.getPhoneNumber());
	}
	else {
		System.out.println("Already another sim is available");
	}
		
	}


@Override
public void removeSim() {
	if(this.sim!=null) {
		sim.deactivation();
		this.sim=null;
		System.out.println("SIM is removed.");
	}
	else {
		System.out.println("SIM slot is empty.");
	}
}
@Override
public void makeCall(long phoneNum) {
    if (sim != null) {
        sim.networkProvider();
        System.out.println("Making a call to " + phoneNum);
    } else {
        System.out.println("No sim card found!!!");
    }
}

@Override
public void sendMsg(long phoneNum, String txt) {
    if (this.sim != null) {
        sim.networkProvider();
        System.out.println("Sending " + txt + " to " + phoneNum);
    }else {
        System.out.println("No sim card found!!!");
    }
}

 }

