package bank.deposit.repository;

import bank.deposit.entity.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositRepo extends JpaRepository<Deposit,Long> {
}
