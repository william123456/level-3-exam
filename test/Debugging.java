import java.util.ArrayList;

public class Debugging {

	ArrayList<String> caseInsenstive = new ArrayList<String>();

	public static void main(String[] args) {
Debugging d = new Debugging();
//System.out.println(d.debuggingMethod());
d.debuggingMethod();
	}

	public int debuggingMethod() {
		caseInsenstive.add("Hi");
		caseInsenstive.add("Hi");
		caseInsenstive.add("Hi");
		caseInsenstive.add("Hi");
		caseInsenstive.add("Hi");
		caseInsenstive.add("hi");
		caseInsenstive.add("hi");
		caseInsenstive.add("hi");
		caseInsenstive.add("hi");
		caseInsenstive.add("hi");
		caseInsenstive.add("hi");
		int numberOfHi = 0;
		for (String s : caseInsenstive) {
			if (s.equalsIgnoreCase("Hi")) {
				numberOfHi++;
				
			}

		}
return numberOfHi;
	}
}
