package org.airsonic.player.controller.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.airsonic.player.dao.MediaFileDao;
import org.airsonic.player.domain.Genre;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/genres")
public class GenreRestController {

	private static final Logger LOG = LoggerFactory.getLogger(GenreRestController.class);

	@Autowired
	private MediaFileDao mediaFileDao;

	@GetMapping
	public ResponseEntity<List<Genre>> getGenres(HttpServletRequest request) throws Exception {
		return ResponseEntity.ok(this.mediaFileDao.getGenres(false));
	}
}
