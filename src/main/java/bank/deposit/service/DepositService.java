package bank.deposit.service;

import bank.deposit.dto.DepositDTO;
import bank.deposit.entity.Deposit;
import bank.deposit.repository.DepositRepo;
import org.springframework.stereotype.Service;

@Service
public class DepositService {
    private final DepositRepo depositRepo;

    public DepositService(DepositRepo depositRepo) {
        this.depositRepo = depositRepo;
    }

    public Deposit createDeposit(DepositDTO depositDTO){
        Deposit deposit= new Deposit();
        deposit.setAmount(depositDTO.getAmount());
        deposit.setCustName(depositDTO.getCustName());
        return depositRepo.save(deposit);
    }
}
