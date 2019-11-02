package org.airsonic.player.controller.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/api")
public class IndexRESTController {

    private static final Logger LOG = LoggerFactory.getLogger(IndexRESTController.class);

    @GetMapping
    public ResponseEntity<Void> index() {
    	// TODO: Write proper root api response, with links to documentation or links to others root endpoint (HATEOAS).
    	// Or simply return 404, since the api itself isn't really a ressource.
        return ResponseEntity.noContent().build();
    }

}
