package com.hemebiotech.analytics;

import java.text.Collator;
import java.util.List;

/**
 * 
 * Read and organize data from a list
 *
 */
public class OrderSymptomDataFromList implements IOrganiser {

	private List<String> symptoms;

	/**
	 * 
	 * @param symptoms a list with all symptoms
	 */
	public OrderSymptomDataFromList(List<String> symptoms) {
		this.symptoms = symptoms;
	}

	@Override
	public List<String> AlphabeticalOrder() {
		java.util.Collections.sort(symptoms, Collator.getInstance());
		return symptoms;
	}
}
