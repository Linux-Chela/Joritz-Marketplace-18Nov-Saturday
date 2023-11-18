package com.ltim.joritz.marketplace.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltim.joritz.marketplace.model.ArtifactModel;
import com.ltim.joritz.marketplace.service.ArtifactServiceImplementation;



@RestController
@RequestMapping("/marketplace")
@CrossOrigin(origins = "http://localhost:8081")
public class ArtifactController {
		
		@Autowired
		ArtifactServiceImplementation artifactService;
		
		
		
		
		@PostMapping("artifact/create")
		public  ArtifactModel createArtifact(@RequestBody ArtifactModel artifactBody) {
			System.out.println("Created Artifact with id: "+artifactBody.getArtifactid());
			return artifactService.createArtifact(artifactBody);
		}
		
		@GetMapping("artifact/getall")
		public List<ArtifactModel> getAllArtifacts() {
			System.out.println("Displaying All Artifacts...");
			return artifactService.getAllArtifacts();
		}
		
		@GetMapping("artifact/getartifact/{artifactId}")
		public Optional<ArtifactModel> getArtifact(@PathVariable int artifactId) {
			System.out.println("Displaying Single Artifact with ID: " + artifactId);
			return artifactService.getArtifact(artifactId);
		}
		
		
}