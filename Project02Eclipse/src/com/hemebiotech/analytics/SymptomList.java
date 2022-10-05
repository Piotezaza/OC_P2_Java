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
	 * @param symptoms a list with all symptoms
	 */
	public SymptomList(List<String> symptomList) {
		TreeMap<String, Integer> results = new TreeMap<>();

		for (int i = 0; i < symptomList.size(); i++) {

			if (results.containsKey(symptomList.get(i))) {
				int count = results.get(symptomList.get(i));
				count++;
				results.put(symptomList.get(i).toLowerCase().trim(), count);
			} else {
				results.put(symptomList.get(i).toLowerCase().trim(), 1);
			}
		}

		this.symptoms = results;
	}
}
