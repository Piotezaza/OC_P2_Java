package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteSymptomInFile implements ISymptomWriter {

	private List<String> symptoms;
	private String filePath;

	public WriteSymptomInFile(List<String> symptoms, String filePath) {
		this.symptoms = symptoms;
		this.filePath = filePath;
	}

	@Override
	public void SetSymptoms() {
		// Creating a fileWriter to write to a file
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Creating a bufferedWriter that uses the fileWriter
		BufferedWriter writer = new BufferedWriter(fileWriter);

		// For each iteration, write symptom in a file
		for (int j = 0; j < symptoms.size(); j++) {
			try {
				writer.write(symptoms.get(j));
				writer.newLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
