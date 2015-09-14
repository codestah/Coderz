package AlexRentalSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {

	
		private String name;
		private int id;
		private static int count = 0;
		private String address;
		private String phone;
		private boolean rating;
		private double rate;
		
		private ArrayList<Customer> customers = new ArrayList<Customer>();
		
		
		Scanner sc = new Scanner(System.in);

		// Constructor
		public Customer(String name, int id, String address, String phone, boolean rating, double rate){
			this.name = name;
			this.id = id;
			this.address = address;
			this.phone = phone;
			this.rating = rating;
			this.rate = rate;
		}

		
		//Accessors
		public String getName(){
			return name;
		}

		public int getId(){
			return id;
		}

		public String getAddress(){
			return address;
		}

		public String getPhone(){
			return phone;
		}

		public Boolean getRating(){
			return rating;
		}
		
		public double getRate(){
			return rate;
		}
		
		//Mutators
		public void setName(String name){
			this.name = name;
		}
		
		public void setId(int id){
			this.id = id;
		}
		
		public void setAddress(String address){
			this.address = address;
		}
		
		public void setPhone(String phone){
			this.phone = phone;
		}
		
		public double setRate(double premDisc){
			return premDisc = rate / 10;
		}


		// Retrieve the last Customer Entered into the array
		for (int i = 0; i < customers.size(); i++) {
			System.out.println(customers.get(i));
		}
		
		//
		
		// Is premium method
		private boolean isPremium(){
			boolean premium = true;
			if (this.setRating(premium)){
				return true;
			}
			return false;
		}
		

		 private boolean setPremium(boolean premium) {
			// TODO Auto-generated method stub
			return false;
		}

		 
		 
		 
		public void printDetails()
		   {
		      System.out.printf("%s %s\n", "Customer Name:", this.name);
		      System.out.printf("%s %s\n", "ID:", this.id);
		      System.out.printf("%s %s\n", "Address:", this.address);
		      System.out.printf("%s %s\n", "Phone:", this.phone);
		      System.out.printf("%s $%.2f\n", "Rating:", this.rating);
		   }

	
		} // End Customer Class
