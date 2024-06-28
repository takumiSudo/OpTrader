package com.optrader.OpTrader.service;

import com.optrader.OpTrader.modal.TwoFactorOTP;
import com.optrader.OpTrader.modal.User;

public interface TwoFactorOtpService {

    TwoFactorOTP createTwoFactorOTP(User user, String otp, String jwt);

    TwoFactorOTP findByUser(Long userId);

    TwoFactorOTP findbyId(String id);

    boolean verifyTwoFactorOtp(TwoFactorOTP twoFactorOtp, String otp);

    void deleteTwoFactorOtp(TwoFactorOTP twoFactorOtp);

}
