# CodingAssignment
helping Sunita Sharma and the people of age group of 65+ to live a healthier and better life by creating a program for elderly care using java

import java.util.*;

public class Health{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int optm;

		if(age>=65){
			System.out.println("choose the following ooptions for the health care checkups\n1.Routine checkup \n2.Checkup for cholestrol,Blood pressure and Sugar levels \n3.Checkup for bones and joints \n4.Doing yoga and exercises \n5.Eating Healthy");
  			optn=sc.nextInt();
			switch(optn){
				case 1:System.out.println("Go for a routine checkup atleast once in three months to a general physician");
				break;

				case 2:System.out.println("Do a test for cholestrol,Blood pressure and Sugar levels and if any rise in found in any of the three then consult the right doctor ");
				break;

				case 3:System.out.println("Do a checkup of joints if any pain or swelling on the joints and arrange an appointment with the orthopedic");
				break;

				case 4:System.out.println("Do Yoga and exercises on daily basis");
				break;

				case 5:System.out.println("Eat healthy by taking care of blood pressure and sugar levels in blood");
				break;
			}
		}
	}
}
