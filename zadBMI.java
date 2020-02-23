import java.util.Scanner;

public class BMI {

	    public static void main(String[] args) {

		            Scanner in = new Scanner(System.in);



			            System.out.print("Enter weight in kg: ");
				            int kg = in.nextInt();


					            System.out.print("Enter height in m: ");
						            int m = in.nextInt();

							            double weightInKilos = kg;
								            double heightInMeters = (m * 0.01);
									            double bmi = weightInKilos / (heightInMeters * heightInMeters) ;



										            System.out.println("Your BMI is: " + bmi);

											            if (bmi < 18.5 ) {
													                System.out.print("Underweight");
															        }

												            else if (bmi >= 18.5 && bmi < 25) {
														                System.out.print("Normal");
																        }

													            else if (bmi >= 25 && bmi < 30) {
															                System.out.print("Overweight");
																	        }

														            else if (bmi >= 30) {
																                System.out.print("Obese");
																		        }
															        }

}
