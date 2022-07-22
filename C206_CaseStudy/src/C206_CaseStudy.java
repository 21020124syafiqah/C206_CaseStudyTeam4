import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Stall> stallList = new ArrayList<Stall>();
		
		stallList.add(new Stall("Western cuisine","17-9-2022"));
		stallList.add(new Stall("Japanese cuisine","26-8-2022"));
		stallList.add(new Stall("Chinese cuisine","9-8-2022"));
		
		
		int option = 0;
		
		while (option != 4) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			
			if(option == 1) {
				
			}else if(option == 2) {
				viewAllStalls(stallList);
			}else if(option == 3) {
				
			}else if(option == 4) {
				System.out.println("Goodbye!");
			}else {
				System.out.println("Invalid option!");
			}
			
		}
	}
	
	public static void menu() {
		C206_CaseStudy.setHeader("Canteen Automation System");
		System.out.println("1.Add stall");
		System.out.println("2.View stall");
		System.out.println("3.Delete stall");
		System.out.println("4.Quit");
	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	public static String retrieveAllStalls(ArrayList<Stall> stallList) {
		String output = "";
		
		for (int i = 0; i < stallList.size(); i++) {
			output += String.format("%-60s \n", stallList.get(i).toString());
		}
		
		return output;
	}
	
	public static void viewAllStalls(ArrayList<Stall> stallList) {
		C206_CaseStudy.setHeader("STALL LIST");
		
		String output = String.format("%-20s %-70s\n", "NAME", "DATE OF OPERATION");
	    output += retrieveAllStalls(stallList);
	    System.out.println(output);
	}

}
