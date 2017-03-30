
public class Main {

	static double numUsers = 500000;
	static double fractionHighSchoolJS = 0.015;
	static double fractionUndergrad = 0.015;
	static double fractionAdult = 0.0005;
	static double numUSHighSchoolJS = 8000000;
	static double numUSUndergrad = 17300000;
	static double numUSAdults = 250000000;
			
	static double numUserProperties = 35;
	static double numMessagesPerUser = 100;
	static double numFuncInvocations = 70;
	
	static double fractionNoPhotos = 0.5;
	static double fractionAvg20Photos = 0.2;
	static double fractionAvg5Photos = 0.3;
	static double fractionProfPic = 0.6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Total number of users: " + getNumUsers());
		System.out.println("Total number of analytics function invocations: " + getNumFuncInvocations());
		System.out.println("Total number of photos uploaded: " + getNumPhotos());
		System.out.println("Total number of photos transferred: " + getNumTransferredPhotos());
		System.out.println("Total number of chat messages: " + getNumChatMessages());
		System.out.println();
		
	}

	public static double getNumUsers() {
		double numHS = fractionHighSchoolJS*numUSHighSchoolJS;
		double numUG = fractionUndergrad*numUSUndergrad;
		double numAdults = fractionAdult*numUSAdults;
		double total = numHS + numUG + numAdults;
		return total;
	}
	
	public static double getNumFuncInvocations() {
		double total = numFuncInvocations*numUsers;
		return total;
	}
	public static double getNumPhotos() {
		double total = numUsers* (fractionNoPhotos*0+fractionAvg20Photos*20+fractionAvg5Photos*5+fractionProfPic);
		return total;
	}
	public static double getNumTransferredPhotos() {
		double total = numUsers* (fractionNoPhotos*0+fractionAvg20Photos*20+fractionAvg5Photos*5);
		return total;
	}
	
	public static double getNumChatMessages() {
		return numMessagesPerUser*numUsers;
	}

	
	
	
	
}
