package com.hemebiotech.analytics;

import java.util.List;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		// Get the list of symptoms from the file.
		ReadSymptomDataFromFile rsdff = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptoms = rsdff.getSymptoms();

		// Order the symptoms by alphabetical
		SymptomList sl = new SymptomList(symptoms);

		// Write in "result.out" the list of the symptoms
		WriteSymptomInFile wsif = new WriteSymptomInFile(sl.symptoms, "Project02Eclipse/result.out");
		wsif.setSymptoms();
	}
}
