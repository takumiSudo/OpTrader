package com.optrader.OpTrader.modal;

import com.optrader.OpTrader.domain.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuth {
    private boolean isEnabled = false;
    private VerificationType sendTo;
}
