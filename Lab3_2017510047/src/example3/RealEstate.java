package example3;

import java.util.ArrayList;

public class RealEstate {
	
	private  String agentName;
	private Address agentAddress;
	private ArrayList<House> house_List;
	
	public RealEstate(String agentName, Address agentAddress) {
		super();
		this.agentName = agentName;
		this.agentAddress = agentAddress;
		house_List = new ArrayList<>();
		
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public Address getAgentAddress() {
		return agentAddress;
	}

	public void setAgentAddress(Address agentAddress) {
		this.agentAddress = agentAddress;
	}

	public ArrayList<House> getHouse_List() {
		return house_List;
	}

	public void setHouse_List(ArrayList<House> house_List) {
		this.house_List = house_List;
	}
	
	public void addHouse(House house)
	{
		house_List.add(house);
	}
	
	public String displayAllHouses()
	{
		String output = "";
		
		for (House house : house_List) {
			output+= house.toString()+"\n";
		}
		return output;
	}
	
	public int getNumOfHouse()
	{
		return house_List.size();
	}
	
	public String searchByPrice(int p1,int p2)
	{
		String output = "";
		
		for (House house : house_List) {
			if(house.getPrice()<=p2 && house.getPrice()>=p1 )
				output+= house.toString()+"\n";
		}
		return output;
	}
	
	
	
	

}
