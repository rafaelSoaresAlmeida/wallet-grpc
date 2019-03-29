package com.wallet.walletserver.service;

import com.wallet.proto.CURRENCY;
import com.wallet.walletserver.entity.User;
import com.wallet.walletserver.exception.UserNotFoundException;
import com.wallet.walletserver.exception.WalletWithSpecificCurrencyNotFoundException;
import com.wallet.walletserver.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findUserById(final int id) {
        log.info("Find User with user id: {}", id);
        return userRepository.findById(id);
    }

    public void validateUser(final User user, final CURRENCY walletCurrency) {
        checkIfUserExists(user);
        if (Objects.isNull(user.getWalletByCurrency(walletCurrency.name()))) {
            log.info("Wallet with this specific currency {} not found", walletCurrency.name());
            throw new WalletWithSpecificCurrencyNotFoundException();
        }
    }

    public void checkIfUserExists(final User user) {
        if (Objects.isNull(user)) {
            log.info("user not found");
            throw new UserNotFoundException("User not found");
        }
    }

    public User saveUser(final User user) {
        log.info("Update User with user id: {}", user.getId());
        return userRepository.save(user);
    }

}
