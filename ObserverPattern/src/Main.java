import org.jrue.classes.HumanResource;
import org.jrue.classes.SoftDevDepartment1;
import org.jrue.classes.SoftDevDepartment2;

public class Main {

	public static void main(String[] args) {
		HumanResource humanResource = new HumanResource();
		
		new SoftDevDepartment1(humanResource);
		new SoftDevDepartment2(humanResource);		
		humanResource.setMemoMessage("Please get your salary slip at 3:00 PM");
		humanResource.setMemoMessage("Please get your salary slip at 4:00 PM");		
		
	}
}