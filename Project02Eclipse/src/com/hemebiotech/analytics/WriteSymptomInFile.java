package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;

public class WriteSymptomInFile implements ISymptomWriter {

	private TreeMap<String, Integer> symptoms;
	private String filePath;

	public WriteSymptomInFile(TreeMap<String, Integer> symptoms, String filePath) {
		this.symptoms = symptoms;
		this.filePath = filePath;
	}

	@Override
	public void setSymptoms() {
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
		for (Entry<String, Integer> entry : symptoms.entrySet()) {
			try {
				writer.write(entry.getKey() + ": " + entry.getValue());
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
