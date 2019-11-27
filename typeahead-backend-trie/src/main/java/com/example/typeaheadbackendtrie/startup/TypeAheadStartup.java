package com.example.typeaheadbackendtrie.startup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.example.typeaheadbackendtrie.utility.TrieUtility;

@Component
public class TypeAheadStartup implements ApplicationListener<ApplicationReadyEvent>{

	@Autowired
	private TrieUtility trieUtility;
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		
		trieUtility.insert("cat");
		trieUtility.insert("cap");
		trieUtility.insert("catalyst");
		trieUtility.insert("cataclysmic");
		trieUtility.insert("catch");
		trieUtility.insert("captain");
		trieUtility.insert("caption");
		trieUtility.insert("captaincy");
		trieUtility.insert("capital");
		
		System.out.println("Added few values to the trie");

		
		
	}

	
}
