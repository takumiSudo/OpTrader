package com.optrader.OpTrader.service;

import com.optrader.OpTrader.modal.User;
import com.optrader.OpTrader.domain.VerficationType;

public interface UserService {

    public User findUserProfileByJwt(String jwt) throws Exception;

    public User findUserbyEmail(String email) throws Exception;

    public User findUserById(Long userId) throws Exception;

    public User enableTwoFactorAuthentication(VerficationType verificationType, String sendTo, User user);

    User updatePassword(User user, String newPassword);

}
