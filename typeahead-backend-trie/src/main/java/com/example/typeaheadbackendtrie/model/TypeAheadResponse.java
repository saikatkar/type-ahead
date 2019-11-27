package com.example.typeaheadbackendtrie.model;

import java.util.List;

/**
 * @author saikatkar
 *
 */
public class TypeAheadResponse {
	
	private List<String> listOfItems;
	
	private String message;

	public List<String> getListOfItems() {
		return listOfItems;
	}

	public void setListOfItems(List<String> listOfItems) {
		this.listOfItems = listOfItems;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
