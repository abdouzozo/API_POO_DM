package nov_APIPOO.tp5.model;



public class Features {
	
	 private String type;
	 Geometry GeometryObject;
	 Properties PropertiesObject;
	 
	 
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Geometry getGeometry() {
		return GeometryObject;
	}
	public void setGeometry(Geometry geometryObject) {
		GeometryObject = geometryObject;
	}
	public Properties getProperties() {
		return PropertiesObject;
	}
	public void setProperties(Properties propertiesObject) {
		PropertiesObject = propertiesObject;
	}
	 
	 
}
