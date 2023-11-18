package com.ltim.joritz.marketplace.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltim.joritz.marketplace.model.ATMetaDataSchemaModel;
import com.ltim.joritz.marketplace.model.ArtifactTypeModel;
import com.ltim.joritz.marketplace.repository.ATMetaDataSchemaRepository;
import com.ltim.joritz.marketplace.repository.ArtifactTypeRepository;

@Service
public class ATMetaDataSchemaServiceImplementation implements ATMetaDataSchemaService {
	
	@Autowired
	ATMetaDataSchemaRepository atMetaDataSchemaRepository;
	@Autowired
	ArtifactTypeRepository artifactTypeRepository;
	
	
	public ATMetaDataSchemaModel createATMetaDataSchema(ATMetaDataSchemaModel atMetaDataSchema) {
		
		int artifactTypeId = atMetaDataSchema.getArtifactType().getArtifactTypeId();
		Optional<ArtifactTypeModel> existingType = artifactTypeRepository.findById(artifactTypeId);
        if (existingType.isPresent()) {
            // If exists, set the ArtifactType and save Artifact
        	atMetaDataSchema.setArtifactType(existingType.get());
            return atMetaDataSchemaRepository.save(atMetaDataSchema);
        } else {
            throw new RuntimeException("ArtifactType is not present for this id");
        }
    
	}
	
	

	
	

}
