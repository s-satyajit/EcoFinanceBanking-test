package com.ecofinancebanking.account;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{accountId}")
    public Account getAccount(@PathVariable String accountId) {
        return accountService.getAccountDetails(accountId);
    }

    @PostMapping("/{accountId}/deposit")
    public boolean deposit(@PathVariable String accountId, @RequestBody double amount) {
        Account account = accountService.getAccountDetails(accountId);
        account.deposit(amount);
        return accountService.updateAccountBalance(accountId, account.getBalance());
    }

    @PostMapping("/{accountId}/withdraw")
    public boolean withdraw(@PathVariable String accountId, @RequestBody double amount) {
        Account account = accountService.getAccountDetails(accountId);
        if (account.withdraw(amount)) {
            return accountService.updateAccountBalance(accountId, account.getBalance());
        }
        return false;
    }
}
