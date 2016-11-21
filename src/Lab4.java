import java.util.Scanner;

public class Lab4 {
	

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		String celestialBody;
		double UserWeight;
		

	
		System.out.println("Hello User");
		sleep(2000) ;
		System.out.println("Sorry to trouble you but we would like to know your....");
		sleep(2000) ;
		System.out.println("There i said it");
		System.out.println("See that CARL i actually asked him");
		System.out.println("CARL:WOW i now finally respect you finally breaking out of your shell at 30");
		System.out.println(".....(SARCASIM!!!!!)");
		System.out.println("ANYWAYS could you tell us already");
		UserWeight = userInput.nextInt();
		
		System.out.println("|||||||                ||||||||");
		sleep(2000) ;
		System.out.println("|||||||                ||||||||");
		sleep(2000) ;
		System.out.println("|||||||----------------||||||||");
		sleep(2000) ;
		System.out.println("|||||||------WEIGHT:---||||||||");
		sleep(2000) ;
		System.out.println("|||||||"+ UserWeight +"||||||||");
		sleep(2000) ;
		System.out.println("|||||||----------------||||||||");
		sleep(2000) ;
		System.out.println("|||||||----------------||||||||");
		sleep(2000) ;
		System.out.println("|||||||                ||||||||");
		sleep(2000) ;
		System.out.println("|||||||                ||||||||");
		sleep(2000) ;
		
		System.out.println("Were Curious which Celestial BODY YOU WOULD WISH TO TAKE A FLIGHT TO ");
		celestialBody = userInput.next();
		
		if(celestialBody.equalsIgnoreCase("Mercury")) {
			System.out.println("Your Weight on Mercury is " + UserWeight * 0.38);
		}
			
		if(celestialBody.equalsIgnoreCase("Venus")) {
			System.out.println("Your Weight on Mercury is " + UserWeight * 0.91);
			}
			
		if(celestialBody.equalsIgnoreCase("Earth")) {
			System.out.println("Your Weight on Mercury is " + UserWeight * 1);
				}
			
		if(celestialBody.equalsIgnoreCase("Moon")) {
			System.out.println("Your Weight on Mercury is " + UserWeight * 0.165);
					}
			
		if(celestialBody.equalsIgnoreCase("Mars")) {
			System.out.println("Your Weight on Mercury is " + UserWeight * 0.38);
						}
			
		if(celestialBody.equalsIgnoreCase("Jupiter")) {
			System.out.println("Your Weight on Mercury is " + UserWeight * 2.34);
			                                          }
			
		if(celestialBody.equalsIgnoreCase("Saturn")) {
			System.out.println("Your Weight on Mercury is " + UserWeight * 1.06);
								                      }
			
		if(celestialBody.equalsIgnoreCase("Uranus")) {
			System.out.println("Your Weight on Mercury is " + UserWeight * 0.92);
		                                              }
			
		if(celestialBody.equalsIgnoreCase("Neptune")) {
			System.out.println("Your Weight on Mercury is " + UserWeight * 1.19);
			                                          }
			
		if(celestialBody.equalsIgnoreCase("Pluto")) {
			System.out.println("Your Weight on Mercury is " + UserWeight * 0.06);
		}
	}

			
	
		

	
	

    public static void sleep (int time)  {
    	try  {
		Thread.sleep(time);
	} catch (Exception e)  {}
	}
}