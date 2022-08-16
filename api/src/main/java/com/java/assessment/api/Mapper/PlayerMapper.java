package com.java.assessment.api.Mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import com.java.assessment.api.Dto.PlayerBalanceDto;
import com.java.assessment.api.Dto.PlayerDto;
import com.java.assessment.api.Entity.Player;

@Mapper(componentModel = "spring")
public interface PlayerMapper {

	PlayerMapper INSTANCE = Mappers.getMapper(PlayerMapper.class);

	PlayerDto entityToDto(Player player);

	Player dtoToEntity(PlayerDto playerDto);

	PlayerBalanceDto entityToPlayerBalanceDto(Player player);

	Player playerBalanceDtoToEntity(PlayerBalanceDto playerBalanceDto);

	List<PlayerDto> entityToDtoList(List<Player> playerList);

	List<Player> dtoToEntityList(List<PlayerDto> playerDtoList);

//	void update(@MappingTarget Player player, PlayerDto playerDto);

}