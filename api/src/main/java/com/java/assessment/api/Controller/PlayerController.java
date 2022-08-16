package com.java.assessment.api.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.assessment.api.Dto.PlayerBalanceDto;
import com.java.assessment.api.Dto.PlayerDto;
import com.java.assessment.api.Service.PlayerService;

@RestController
public class PlayerController {

	PlayerService service;

	public PlayerController(PlayerService service) {
		this.service = service;
	}

	@GetMapping(value = "/player/{id}/")
	public PlayerDto getPlayer(@PathVariable("id") Integer id) {
		return service.getPlayer(id);

	}

	@GetMapping(value = "/casino/player/{id}/balance")
	public PlayerBalanceDto getPlayerBalance(@PathVariable("id") Integer id) {
		return service.getPlayerBalance(id);
	}

	@GetMapping(value = "/player")
	public List<PlayerDto> getPlayerList() {

		return service.getPlayerList();
	}
}