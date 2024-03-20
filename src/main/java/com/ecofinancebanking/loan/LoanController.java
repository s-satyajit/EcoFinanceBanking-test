package com.ecofinancebanking.loan;

import com.ecofinancebanking.account.PostMapping;
import com.ecofinancebanking.account.RequestMapping;
import com.ecofinancebanking.account.RestController;
import com.ecofinancebanking.billpayment.RequestParam;

@RestController
@RequestMapping("/loan")
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/apply")
    public String applyForLoan(@RequestParam String accountId, @RequestParam double amount) {
        boolean success = loanService.applyForLoan(accountId, amount);
        return success ? "Loan application submitted successfully" : "Loan application failed";
    }

    @PostMapping("/payment")
    public String processLoanPayment(@RequestParam String accountId, @RequestParam double amount) {
        boolean success = loanService.processLoanPayment(accountId, amount);
        return success ? "Loan payment processed successfully" : "Loan payment failed";
    }
}
