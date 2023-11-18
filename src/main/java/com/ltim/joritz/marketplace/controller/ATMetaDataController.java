package com.ltim.joritz.marketplace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltim.joritz.marketplace.model.ATMetaDataModel;
import com.ltim.joritz.marketplace.model.ATMetaDataSchemaModel;
import com.ltim.joritz.marketplace.model.ArtifactTypeModel;
import com.ltim.joritz.marketplace.service.ATMetaDataService;
import com.ltim.joritz.marketplace.service.ArtifactTypeService;

@RestController
@RequestMapping("/marketplace")
@CrossOrigin(origins = "http://localhost:8081")
public class ATMetaDataController {

	@Autowired
	ATMetaDataService atMetaDataService;
	
	@Autowired
	ArtifactTypeService artifactTypeService;
	
	
	@PostMapping("atmetadata/create")
	public ATMetaDataModel createATMetaData(@RequestBody ATMetaDataModel atMetaData) {
		return atMetaDataService.createATMetaData(atMetaData);
	}
}
