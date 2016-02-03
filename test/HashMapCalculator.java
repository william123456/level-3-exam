import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hM1, HashMap<String, String> hM2) {
		int totalNumCommonKeyValuePairs = 0;
		for (String s : hM1.keySet()) {
			for (String h : hM2.keySet()) {
				if (h == s) {
					for (String s2 : hM1.values()) {
						for (String h2 : hM2.values()) {
							if (s2 == h2) {
								totalNumCommonKeyValuePairs++;
							}
						}
					}
				}
			}

		}
		return totalNumCommonKeyValuePairs / hM2.keySet().size();
	}
}
