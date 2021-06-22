import java.util.*;

class HeathCheckup{


public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many months ago was the last Routine Checkup done");
	int months=sc.nextInt();
	System.out.println("Enter Cholestrol level in mg/dl");
	int chol=sc.nextInt();
	System.out.println("Enter Diastolic and Systolic Blood Pressure in mm Hg");
	int dbp=sc.nextInt();
	int sbp=sc.nextInt();
	System.out.println("Enter Sugar Levels Before meal and After meal in mg/dl");
	int bef=sc.nextInt();
	int aft=sc.nextInt();
	

		if((months>=3)&&(chol>=200||dbp<80||sbp>150||bef<70||bef>130||aft>180))
			System.out.println("\nMonths :" +months+"\nCholestrol  level in mg/dl : " +chol+ "\nDiastolic and Systolic Blood Pressure in mm Hg \nDiastolic :" +dbp + "\nSystolic :"+sbp+"\nSugar Levels Before meal and After meal in mg/dl : \nBefore meal:" +bef+"\nAfter meal:"+aft+"\nYou need to visit the doctor since the readings in the above Performed tests are not within the normal range and your last visit exceeded the time span of 3 Months");

		else if(chol>=200||dbp<80||sbp>150||bef<70||bef>130||aft>180)
			System.out.println("\nCholestrol  level in mg/dl : " +chol+ "\nDiastolic and Systolic Blood Pressure in mm Hg \nDiastolic :" +dbp + "\nSystolic :"+dbp+"\nSugar Levels Before meal and After meal in mg/dl : \nBefore meal:" +bef+"\nAfter meal:"+aft+"\nYou need to visit the doctor since the readings in the above Performed tests are not within the normal range");
		
		else if(months>=3)
			System.out.println("\nYou need to visit the doctor since your last visit exceeded the time span of 3 Months \nMonths :" +months);
		
 	System.out.println("\nAlso follow the points given below");
	System.out.println("\n1.Do Yoga and exercises on daily basis");
	System.out.println("2.Eat healthy");
	System.out.println("3.Take care of Joints and Bones");
	
		
	
}
}
