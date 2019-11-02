package org.airsonic.player.controller.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class IndexRestController {

	private static final Logger LOG = LoggerFactory.getLogger(IndexRestController.class);

	@GetMapping
	public ResponseEntity<Void> index() {
		// TODO: Write proper root api response, with links to documentation or links to
		// others root endpoint (HATEOAS).
		// Or simply return 404, since the api itself isn't really a ressource.
		return ResponseEntity.noContent().build();
	}
}
