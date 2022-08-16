package com.java.assessment.api.Service;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.java.assessment.api.Dto.TransactionBalanceDto;
import com.java.assessment.api.Dto.TransactionReportDto;
import com.java.assessment.api.Entity.Player;
import com.java.assessment.api.Entity.TransactionDetail;
import com.java.assessment.api.Mapper.TransactionDetailMapper;
import com.java.assessment.api.Repository.PlayerRepository;
import com.java.assessment.api.Repository.TransactionDetailRepository;

@Service
@Component
public class TransactionDetailService {

	@Autowired
	TransactionDetailRepository transactionDetailRepository;

	@Autowired
	TransactionDetailMapper transactionDetailMapper;

	@Autowired
	PlayerRepository playerRepo;

	public List<TransactionReportDto> getTransactionDetailList(String username) {

		return TransactionDetailMapper.INSTANCE
				.entityToDtoList(transactionDetailRepository.topTransactionsByUsernameNative(username));
	}

	@Transactional
	public TransactionBalanceDto balanceTransaction(Integer id, TransactionBalanceDto transactionBalanceDto) {
		Player player = playerRepo.getById(id);
		TransactionDetail transactionDetail = new TransactionDetail();
		transactionDetail.setTransactionType(transactionBalanceDto.getTransactionType());
		transactionDetail.setTransactionDatetime(LocalDateTime.now());
		transactionDetail.setAmount(transactionBalanceDto.getAmount());
		transactionDetail.setPlayer(player);

		transactionDetailRepository.save(transactionDetail);

		if (transactionBalanceDto.getTransactionType().equals("WAGER")) {
			player.setBalance((player.getBalance() - transactionBalanceDto.getAmount()));
		} else if (transactionBalanceDto.getTransactionType().equals("WIN")) {
			player.setBalance((player.getBalance() + transactionBalanceDto.getAmount()));
		}
		playerRepo.save(player);
		TransactionDetail updatedRecord = transactionDetailRepository.getById(transactionDetail.getTransactionId());

		return TransactionDetailMapper.INSTANCE.entityToBalanceDto(updatedRecord);
	}
}
