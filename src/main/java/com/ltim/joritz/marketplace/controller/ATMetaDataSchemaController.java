package com.ltim.joritz.marketplace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltim.joritz.marketplace.model.ATMetaDataSchemaModel;
import com.ltim.joritz.marketplace.service.ATMetaDataSchemaService;

@RestController
@RequestMapping("/marketplace")
@CrossOrigin(origins = "http://localhost:8081")
public class ATMetaDataSchemaController {
	
	@Autowired
	ATMetaDataSchemaService atMetaDataSchemaService;
	
	
	@PostMapping("atmetadataschema/create")
	public ATMetaDataSchemaModel createATMetaDataSchema(ATMetaDataSchemaModel atMetaDataSchema) {
		
		return atMetaDataSchemaService.createATMetaDataSchema(atMetaDataSchema);
	}

}
