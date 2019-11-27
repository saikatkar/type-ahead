package com.example.typeaheadbackendtrie.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.typeaheadbackendtrie.model.TypeAheadResponse;
import com.example.typeaheadbackendtrie.utility.TrieUtility;

/**
 * @author saikatkar
 *
 */
@RestController
public class TypeAheadAPI {
	
	@Autowired
	private TrieUtility trieUtility;
	
	@GetMapping("/api/search/{prefix}")
	public ResponseEntity<TypeAheadResponse> checkRateLimit(@PathVariable String prefix){
		
		List<String> collection = trieUtility.startWithKeys(prefix);
		TypeAheadResponse typeAheadResponse = new TypeAheadResponse();
		typeAheadResponse.setListOfItems(collection);
		if(collection.size()>0) {
			typeAheadResponse.setMessage("Found Some");

		}else {
			typeAheadResponse.setMessage("Nothing Found");

		}
		
		return new ResponseEntity<TypeAheadResponse>(typeAheadResponse,HttpStatus.OK);
	}

}
