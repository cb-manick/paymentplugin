package org.cb.payment;

import org.cb.model.*;

public interface PaymentPluginApi {

	public CreditCardOut createProfile(PaymentMethodIn cardIn);

	public TransactionOut payment(String profileToken, String cardToken, GwTxnIn in);
}
