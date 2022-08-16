package com.java.assessment.api.Repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.java.assessment.api.Entity.TransactionDetail;

@Repository
public interface TransactionDetailRepository extends JpaRepository<TransactionDetail, BigInteger> {

	@Query(value = "SELECT td.* FROM Transaction_Detail td inner join player p on (td.player_id = p.player_Id) where p.username = :username order by td.transaction_datetime desc limit 10;", nativeQuery = true)
	List<TransactionDetail> topTransactionsByUsernameNative(@Param("username") String username);
}
