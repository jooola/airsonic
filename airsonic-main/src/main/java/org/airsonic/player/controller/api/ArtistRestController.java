package org.airsonic.player.controller.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/artists")
public class ArtistRestController {

	private static final Logger LOG = LoggerFactory.getLogger(ArtistRestController.class);

	@GetMapping(path = "/{id}")
	public ResponseEntity<List<Void>> getArtistById(@PathVariable(value = "id") String artistId) throws Exception {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}

	@GetMapping
	public ResponseEntity<List<Void>> getArtists(HttpServletRequest request) throws Exception {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}
}
