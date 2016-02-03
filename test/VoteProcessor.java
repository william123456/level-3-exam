import java.util.ArrayList;

public class VoteProcessor {
	Level3CodingExam l3CE;

	public static void main(String[] args) {

	}
	
	public String calculateElectionWinner(ArrayList<String> votes) {
//		ArrayList<String> votes1 = new ArrayList<String>();
//		votes1.add("pope francis");
//		votes1.add("Pope Francis");
//		votes1.add("edward Snowden");
//		votes1.add("EDWARD SNOWDEN");
//		votes1.add("Edward snowden");
//		votes1.add("Pope Francis");
//		votes1.add("Edward Snowden");
//		votes1.add("pope Francis");
//		votes1.add("Pope francis");
//		votes1.add("Pope Francis");
//		votes1.add("Edward Snowden");
		
		int votesForSnowden = 0;
		int votesForFrancis = 0;
		l3CE = new Level3CodingExam();
		for (String v : votes) {
			if (v.equalsIgnoreCase("Edward Snowden")) {
				votesForSnowden++;
			} else if (v.equalsIgnoreCase("Pope Francis")) {
				votesForFrancis++;
			}
		}
		System.out.println();
		if (votesForSnowden > votesForFrancis) {
			return "edward snowden";
		} else if (votesForFrancis > votesForSnowden) {
			return "pope francis";
		}
		else{
			return "TIE";
		}
	}
}