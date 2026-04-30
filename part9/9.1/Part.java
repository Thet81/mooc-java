// Part.java

public class Part{
	private String identifier;
	private String manufacture;
	private String description;

	public Part(String identifier, String manufacture, String description){
		this.identifier = identifier;
		this.manufacture = manufacture;
		this.description = description;
	}

	public String getIdentifier(){
		return this.identifier;
	}

	public String getDescription () {
		return this.description;
	}

	public String getManufacture(){
		return this.manufacture;
	}
}