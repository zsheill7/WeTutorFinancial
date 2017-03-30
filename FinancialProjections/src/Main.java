
public class Main {

	static double numUsers = 100;
	static double fractionHighSchoolJS = 0.003; //changed from 1.5% to 0.3%
	static double fractionUndergrad = 0.001; //changed from 1.5% to 0.1%
	static double fractionAdult = 0; //don't include adults
	static double numUSHighSchoolJS = 274078; //king county hschoolers
	static double numUSUndergrad = 140000; //king county college
	static double numUSAdults =0;//don't include adults
			
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
