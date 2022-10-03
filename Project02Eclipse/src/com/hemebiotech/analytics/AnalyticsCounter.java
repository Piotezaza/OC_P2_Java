package com.hemebiotech.analytics;

import java.util.List;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		// Get the list of symptoms from the file.
		ReadSymptomDataFromFile rsdff = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptoms = rsdff.GetSymptoms();

		// Order the symptoms by alphabetical
		OrderSymptomDataFromList osdfl = new OrderSymptomDataFromList(symptoms);
		List<String> orderedSymptoms = osdfl.AlphabeticalOrder();

		// Count number of symptoms from a same type
		CountSymptoms cs = new CountSymptoms(orderedSymptoms);
		List<String> finalSymptomsList = cs.Count();

		// Write in "result.out" the list of the symptoms
		WriteSymptomInFile wsif = new WriteSymptomInFile(finalSymptomsList, "Project02Eclipse/result.out");
		wsif.SetSymptoms();
	}
}
