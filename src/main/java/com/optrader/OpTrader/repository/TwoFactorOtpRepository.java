package com.optrader.OpTrader.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.optrader.OpTrader.modal.TwoFactorOTP;

public interface TwoFactorOtpRepository extends JpaRepository<TwoFactorOTP, String> {

    TwoFactorOTP findByUserId(Long userId);

}
