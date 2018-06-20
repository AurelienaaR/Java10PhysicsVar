package descriptions;

public class Environnement extends DescrBin {

	String titleTopic;
	String contentTopic;
	String attrTitle = "Description du thème " + titleTopic;
	String attrContent = "Description du thème " + contentTopic;

	int attrInt;
	double attrDouble;
	boolean attrBool;
	
	public void fDescrVoid() {
		
	}

	public String fDescrString() {
		String fDescrReturn = "";
		return fDescrReturn;
	}
	
}
