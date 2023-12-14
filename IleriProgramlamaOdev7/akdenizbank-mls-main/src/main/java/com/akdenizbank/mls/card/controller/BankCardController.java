package com.akdenizbank.mls.card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import com.akdenizbank.mls.card.BankCard;
import com.akdenizbank.mls.card.service.BankCardService;
import com.akdenizbank.mls.generic.rest.GenericApiResponse;

@RestController
@RequestMapping("/api/v1/bank-cards")
public class BankCardController {

    @Autowired
    private BankCardService bankCardService;

    //TODO : CREATE BANK CARD METHOD
    //TODO : UPDATE BANK CARD METHOD
    @GetMapping
    public GenericApiResponse getAlBankCards(Pageable pageable) {
        Iterable<BankCard> bankCardsPage = this.bankCardService.getAll(pageable);
        return new GenericApiResponse(200, "Success", "345732945213", bankCardsPage);
    }

    @GetMapping("/{id}")
    public GenericApiResponse getById(@PathVariable String id) {
        BankCard bankCardInDB = this.bankCardService.getById(id);
        if (bankCardInDB == null) {
            throw new RuntimeException("No Such Bank Card");
        }
        return new GenericApiResponse(200, "Success", "23097452893", bankCardInDB);
    }

    @DeleteMapping("/{id}")
    public GenericApiResponse deleteCard(@PathVariable String id) {
        this.bankCardService.delete(id);
        return new GenericApiResponse(200, "Success", "34265782");
    }

    @PostMapping //İlgili TODO kısmı, BankCardService classında methodu yazıldı.
    public GenericApiResponse createBankCard(@RequestBody BankCard bankCard) {
        BankCard createdBankCard = this.bankCardService.create(bankCard);
        return new GenericApiResponse(201, "Bank Card Created", "23097452893", createdBankCard);
    }

    @PutMapping("/{id}") //İlgili TODO kısmı, BankCardService classında methodu yazıldı.
    public GenericApiResponse updateBankCard(@PathVariable String id, @RequestBody BankCard bankCard) {
        BankCard updatedBankCard = this.bankCardService.update(id, bankCard);
        return new GenericApiResponse(200, "Bank Card Updated", "23097452893", updatedBankCard);
    }

}
