// Engine.java

public class Engine extends Part{
	private String engineType;

	public Engine(String engineType, String identifier, String manufacture,String description){
		super(identifier,manufacture,description);
		this.engineType = engineType;
	}

	public String getEngineType (){
		return this.engineType;
	}
}