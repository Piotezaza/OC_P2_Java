package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;

public class CountSymptoms {

	private List<String> symptoms;

	public CountSymptoms(List<String> symptoms) {
		this.symptoms = symptoms;
	}

	/**
	 * Count number of iterations of symptoms
	 * 
	 * @param symptoms list of symptoms pre ordered alphabeticaly
	 * @return return a list of symptoms with their number of iteration
	 */
	public List<String> Count() {
		ArrayList<String> result = new ArrayList<String>();

		int count = 0;
		String symptom = "";

		// loop on each symptom
		for (int i = 0; i < symptoms.size(); i++) {
			symptom = symptoms.get(i); // get actual symptom of the loop
			
			/* 
			 * Check if i is null or not and then
			 * compare symptom to the precedent
			 * iteration
			 */
			int comparison = i == 0 ? 0 : symptom.compareTo(symptoms.get(i - 1)); 
			
			if (comparison != 0) { // if different
				result.add(symptoms.get(i - 1) + ": " + count); // Write for example "anxiety: 5"
				count = 1; // set the initial count to 1
			} else if (comparison == 0) {
				count++; // if no equivalence between two symptoms, the counter get 1
			}
		}

		return result;
	}
}