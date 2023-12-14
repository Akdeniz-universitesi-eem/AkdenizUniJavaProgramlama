package com.akdenizbank.mls.card.service;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.akdenizbank.mls.card.BankCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.server.ResponseStatusException;

@Service
public class BankCardService {

    private BankCardRepository bankCardRepository;

    public BankCardService(BankCardRepository bankCardRepository) {
        this.bankCardRepository = bankCardRepository;
    }

    public BankCard create(BankCard bankCard) {
        return this.bankCardRepository.save(bankCard);
    }

    public BankCard getById(String id) {
        return this.bankCardRepository.findById(id).orElse(null);
    }

    public Iterable<BankCard> getAll(Pageable pageable) {
        return this.bankCardRepository.findAll();
    }

    public void delete(String id) {
        BankCard cardInDB = this.getById(id);
        if (cardInDB == null) {
            throw new RuntimeException("No Such Bank Card");
        }
        this.bankCardRepository.delete(cardInDB);
    }

    public interface BankCardRepository extends CrudRepository<BankCard, String> {
    }

    public BankCard update(String id, BankCard bankCard) {

        BankCard existingBankCard = bankCardRepository.findById(id).orElseThrow(() -> new ResponseStatusException(bankCard.getBankaccount().getHttpStatusCode(), "Bank Card not found with id: " + id));


        existingBankCard.setNameoncard(bankCard.getNameoncard());


        BankCard updatedBankCard = bankCardRepository.save(existingBankCard);

        return updatedBankCard;
    }
}
