package org.airsonic.player.controller.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/search")
public class SearchRestController {

	private static final Logger LOG = LoggerFactory.getLogger(SearchRestController.class);

	@GetMapping()
	public ResponseEntity<List<Void>> search(@RequestParam String query) throws Exception {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}
}
