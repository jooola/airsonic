/*
 This file is part of Libresonic.

 Libresonic is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Libresonic is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Libresonic.  If not, see <http://www.gnu.org/licenses/>.

 Copyright 2016 (C) Libresonic Authors
 Based upon Subsonic, Copyright 2009 (C) Sindre Mehus
 */
package org.airsonic.player.controller.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.airsonic.player.domain.MusicFolder;
import org.airsonic.player.service.SecurityService;
import org.airsonic.player.service.SettingsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/music-folders")
public class MusicFolderRestController {

	private static final Logger LOG = LoggerFactory.getLogger(MusicFolderRestController.class);

	@Autowired
	private SettingsService settingsService;
	@Autowired
	private SecurityService securityService;

	@GetMapping
	public ResponseEntity<List<MusicFolder>> getMusicFolders(HttpServletRequest request) throws Exception {
		String username = this.securityService.getCurrentUsername(request);
		List<MusicFolder> musicFoldersForUser = this.settingsService.getMusicFoldersForUser(username);

		return ResponseEntity.ok(musicFoldersForUser);
	}
}
