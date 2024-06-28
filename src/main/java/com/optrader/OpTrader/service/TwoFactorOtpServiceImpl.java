package com.optrader.OpTrader.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optrader.OpTrader.modal.TwoFactorOTP;
import com.optrader.OpTrader.modal.User;
import com.optrader.OpTrader.repository.TwoFactorOtpRepository;

@Service
public class TwoFactorOtpServiceImpl implements TwoFactorOtpService {

    @Autowired
    private TwoFactorOtpRepository twoFactorOtpRepository;

    @Override
    public TwoFactorOTP createTwoFactorOTP(User user, String otp, String jwt) {
        UUID uuid = UUID.randomUUID();

        String id = uuid.toString();

        TwoFactorOTP twoFactorOtp = new TwoFactorOTP();
        twoFactorOtp.setOtp(otp);
        twoFactorOtp.setJwt(jwt);
        twoFactorOtp.setId(id);
        twoFactorOtp.setUser(user);

        return twoFactorOtpRepository.save(twoFactorOtp);
    }

    @Override
    public TwoFactorOTP findByUser(Long userId) {
        return twoFactorOtpRepository.findByUserId(userId);
    }

    @Override
    public TwoFactorOTP findbyId(String id) {
        Optional<TwoFactorOTP> opt = twoFactorOtpRepository.findById(id);
        return opt.orElse(null);
    }

    @Override
    public boolean verifyTwoFactorOtp(TwoFactorOTP twoFactorOtp, String otp) {
        return twoFactorOtp.getOtp().equals(otp);
    }

    @Override
    public void deleteTwoFactorOtp(TwoFactorOTP twoFactorOtp) {

        twoFactorOtpRepository.delete(twoFactorOtp);
    }

}
