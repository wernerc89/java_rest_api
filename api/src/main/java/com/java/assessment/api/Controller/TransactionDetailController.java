package com.java.assessment.api.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.assessment.api.Dto.TransactionBalanceDto;
import com.java.assessment.api.Dto.TransactionReportDto;
import com.java.assessment.api.Service.TransactionDetailService;

@RestController
public class TransactionDetailController {

	TransactionDetailService transactionDetailService;

	public TransactionDetailController(TransactionDetailService transactionDetailService) {
		this.transactionDetailService = transactionDetailService;
	}

	@PostMapping(value = "/casino/admin/player/transactions")
	public List<TransactionReportDto> getTransactionDetail(@RequestBody String username) {
		return transactionDetailService.getTransactionDetailList(username);
	}

	@PostMapping(value = "/casino/player/{id}/update")
	public TransactionBalanceDto updatePlayer(@PathVariable("id") Integer id,
			@RequestBody TransactionBalanceDto transactionBalanceDto) {
		return transactionDetailService.balanceTransaction(id, transactionBalanceDto);
	}
}
