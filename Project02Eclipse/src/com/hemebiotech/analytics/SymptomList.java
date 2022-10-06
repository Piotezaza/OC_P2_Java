package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * 
 * Read and organize data from a list
 *
 */
public class SymptomList {

	public TreeMap<String, Integer> symptoms;

	/**
	 * 
	 * @param symptoms a list with all symptoms ordered by alphabetical
	 */
	public SymptomList(List<String> symptomList) {
		TreeMap<String, Integer> results = new TreeMap<>();

		for (int i = 0; i < symptomList.size(); i++) {

			// If the key already exists
			if (results.containsKey(symptomList.get(i))) {
				int count = results.get(symptomList.get(i)); // retrieval of current value
				count++; // Adding 1 to the value
				results.put(symptomList.get(i).toLowerCase().trim(), count); // We put everything in lowercase, we
																				// remove superfluous spaces and we add
																				// the new count
			} else {
				results.put(symptomList.get(i).toLowerCase().trim(), 1); // Set default value to 1
			}
		}

		this.symptoms = results;
	}
}
