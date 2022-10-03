package com.hemebiotech.analytics;

import java.util.List;

/**
 * 
 * Allows you to organize lists in several different ways
 *
 */
public interface IOrganiser {

	/**
	 * Sort data alphabetically
	 * 
	 * @return a raw list of all symptoms organized in alphabetical order
	 */
	List<String> AlphabeticalOrder();
}