package org.airsonic.player.controller.api;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.airsonic.player.dto.LoginDto;
import org.airsonic.player.dto.TokenDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/auth")
public class AuthRestController {

	private static final Logger LOG = LoggerFactory.getLogger(AuthRestController.class);

	@RequestMapping(value = "login")
	@PostMapping()
	public ResponseEntity<TokenDto> login(@Valid @RequestBody final LoginDto authDTO) throws Exception {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}

	@RequestMapping(value = "logout")
	@PostMapping()
	public ResponseEntity<Void> logout(HttpServletRequest request) throws Exception {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}

	@RequestMapping(value = "refresh")
	@PostMapping()
	public ResponseEntity<TokenDto> refresh(HttpServletRequest request) throws Exception {
		return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	}
}
