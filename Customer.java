public class Customer {
	

private String name;
private String id;
private String address;
private String phone;
private boolean rating;




public Customer(String name, String id, String address, String phone, boolean rating){

	this.name = name;
	this.id = id;
	this.address = address;
	this.phone = phone;
	this.rating = rating;
}

public String getName(){
	return name;
}

public String getId(){
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



// Set rating method
public Boolean setRating(){
	
	premium = true;

	if (setRating() == premium) {
		return true;
	}
	return false;
}

// Is premium method
public Boolean isPremium(){
	if (premium.isPremium){
		return true;
	}
	return false;
}




 public void printDetails()
   {
      System.out.printf("%s %s\n", "Customer Name:", this.name);
      System.out.printf("%s %s\n", "Customer ID:", this.id);
      System.out.printf("%s %s\n", "Hirer Name:", this.address);
      System.out.printf("%s %s\n", "Description:", this.phone);
      System.out.printf("%s $%.2f\n", "Hire Fee:", this.rating);
   }


} // End Customer Class