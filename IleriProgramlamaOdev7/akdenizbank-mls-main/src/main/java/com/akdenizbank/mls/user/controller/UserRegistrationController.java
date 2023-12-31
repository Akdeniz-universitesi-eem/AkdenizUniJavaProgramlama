package com.akdenizbank.mls.user.controller;

import com.akdenizbank.mls.user.EmployeeUser;
import com.akdenizbank.mls.xaction.CreateEmployeeUserXAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akdenizbank.mls.account.BankAccount;
import com.akdenizbank.mls.card.BankCard;
import com.akdenizbank.mls.card.service.BankCardService;
import com.akdenizbank.mls.generic.rest.GenericApiResponse;
import com.akdenizbank.mls.user.money.Currency;
import com.akdenizbank.mls.user.money.Money;
import com.akdenizbank.mls.user.CustomerUser;
import com.akdenizbank.mls.user.service.CustomerUserService;
import com.akdenizbank.mls.util.RandomizerUtils;
import com.akdenizbank.mls.util.TimeUtils;
import com.akdenizbank.mls.xaction.CreateCustomerUserXAction;

@RestController
@RequestMapping("/api/v1/user-registrations")
public class UserRegistrationController {

    @Autowired
    private CustomerUserService customerUserService;

    @Autowired
    private BankCardService bankCardService;

    @PostMapping("/customers")
    public GenericApiResponse createCustomer(@RequestBody CreateCustomerUserXAction xaction) {
        EmployeeUser customer = new EmployeeUser();
        customer.setName(xaction.getName());
        customer.setSurname(xaction.getSurname());
        customer.setEmail(xaction.getEmail());

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAppuser(customer);
        bankAccount.setDepositedmoney(new Money(0.0, Currency.TRY));
        customer.setBankaccount(bankAccount);
        customer = customerUserService.create(customer);

        BankCard bankCard = new BankCard();
        bankCard.setBankaccount(bankAccount);
        bankCard.setCardnumber(RandomizerUtils.getRandomNumeric(16));
        bankCard.setCvc(Integer.parseInt(RandomizerUtils.getRandomNumeric(3)));
        bankCard.setExpiredate(TimeUtils.tsInstantNow().toEpochMilli() + (1000 * 60 * 60 * 60 * 24 * 30 * 12 * 8));
        bankCard.setNameoncard(xaction.getName() + " " + xaction.getSurname());
        bankCardService.create(bankCard);

        return new GenericApiResponse(200, "Success", "0002#0001", customer);
    }

    @PostMapping("/employees")
    public <DuplicateEmployeeException extends Throwable> GenericApiResponse createEmployee(@RequestBody CreateEmployeeUserXAction xaction) throws DuplicateEmployeeException {
        EmployeeUser employee = new EmployeeUser();
        employee.setName(xaction.getName());
        employee.setPosition(xaction.getPosition());
        employee.setSalary(xaction.getSalary());

        employee = customerUserService.create(employee);

        return new GenericApiResponse(200, "Success", "0002#0001", employee);
    }

    private class InvalidEmployeeDataException extends Throwable {
    }

    //TODO : Register Employee user method
}
