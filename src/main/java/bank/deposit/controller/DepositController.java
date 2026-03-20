package bank.deposit.controller;

import bank.deposit.dto.DepositDTO;
import bank.deposit.entity.Deposit;
import bank.deposit.service.DepositService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deposits")
public class DepositController {
    DepositService depositService;

    public Deposit createDeposit(DepositDTO depositDTO) {
        return  depositService.createDeposit(depositDTO);
    }
}
