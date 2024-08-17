package com.optrader.OpTrader.modal;

import com.optrader.OpTrader.domain.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuth {
    private VerificationType sendTo;
	private boolean booleanenabled = false;
}