package org.cb.stripe;

import org.cb.model.CreditCardOut;
import org.cb.model.GwTxnIn;
import org.cb.model.PaymentMethodIn;
import org.cb.model.TransactionOut;
import org.cb.payment.PaymentPluginApi;

public class StripeGateway implements PaymentPluginApi {
    @Override
    public CreditCardOut createProfile(PaymentMethodIn cardIn) {
        CreditCardOut creditCardOut = new CreditCardOut();
        creditCardOut.setLast4(cardIn.getCardNumber().substring(cardIn.getCardNumber().length(), -4));
        creditCardOut.setName("testing");
        creditCardOut.setGatewayToken("123");
        creditCardOut.setGatewayCustomer("customer_123");
        creditCardOut.setPaymentMethod("card");
        return creditCardOut;
    }

    @Override
    public TransactionOut payment(String profileToken, String cardToken, GwTxnIn in) {
        TransactionOut transactionOut = new TransactionOut();
        transactionOut.setGatewayTransactionId("transaction_123");
        transactionOut.setStatus("success");
        transactionOut.setGatewayName("stripe");
        return transactionOut;
    }
}
