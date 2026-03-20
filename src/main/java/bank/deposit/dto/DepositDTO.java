package bank.deposit.dto;

import jakarta.validation.constraints.Min;
import org.antlr.v4.runtime.misc.NotNull;

public class DepositDTO {
    @NotNull
    private  String custName;
    @Min(0)
    private double amount;
    private int period;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
