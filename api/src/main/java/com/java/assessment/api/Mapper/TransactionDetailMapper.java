package com.java.assessment.api.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import com.java.assessment.api.Dto.TransactionBalanceDto;
import com.java.assessment.api.Dto.TransactionDetailDto;
import com.java.assessment.api.Dto.TransactionReportDto;
import com.java.assessment.api.Entity.TransactionDetail;

@Mapper(componentModel = "spring")
public interface TransactionDetailMapper {

	TransactionDetailMapper INSTANCE = Mappers.getMapper(TransactionDetailMapper.class);

	TransactionBalanceDto entityToBalanceDto(TransactionDetail transactionDetail);

	TransactionDetail balanceDtoToEntity(TransactionBalanceDto transactionBalanceDto);

	@Mapping(target="transaction_type", source = "transactionType")
	TransactionReportDto entityToReportDto(TransactionDetail transactionDetail);

	TransactionDetail reportDtoToEntity(TransactionReportDto transactionReportDto);

	List<TransactionReportDto> entityToDtoList(List<TransactionDetail> transactionDetailList);

	List<TransactionDetail> dtoToEntityList(List<TransactionDetailDto> transactionDetailDtoList);

	void update(@MappingTarget TransactionDetail transactionDetail, TransactionDetailDto transactionDetailDto);

	void updateBalance(@MappingTarget TransactionDetail transactionDetail, TransactionBalanceDto transactionBalanceDto);

}
