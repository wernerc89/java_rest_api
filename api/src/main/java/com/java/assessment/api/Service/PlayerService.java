package com.java.assessment.api.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.java.assessment.api.Dto.PlayerBalanceDto;
import com.java.assessment.api.Dto.PlayerDto;
import com.java.assessment.api.Entity.Player;
import com.java.assessment.api.Mapper.PlayerMapper;
import com.java.assessment.api.Repository.PlayerRepository;

@Service
@Component
public class PlayerService {

	@Autowired
	PlayerRepository playerRepo;

	@Autowired
	PlayerMapper playerMapper;

	public PlayerDto getPlayer(Integer player_id) {
		Player player = playerRepo.getById(player_id);
		return PlayerMapper.INSTANCE.entityToDto(player);

	}

	public PlayerBalanceDto getPlayerBalance(Integer player_id) {
		Player player = playerRepo.getById(player_id);
		return PlayerMapper.INSTANCE.entityToPlayerBalanceDto(player);

	}

	public List<PlayerDto> getPlayerList() {
		List<Player> playerList = playerRepo.findAll();
		return PlayerMapper.INSTANCE.entityToDtoList(playerList);
	}

}
