package org.cb.model;

public class CreditCardOut {
    private String last4;

    public String getLast4() {
        return last4;
    }

    public void setLast4(String last4) {
        this.last4 = last4;
    }

    public String getGatewayToken() {
        return gatewayToken;
    }

    public void setGatewayToken(String gatewayToken) {
        this.gatewayToken = gatewayToken;
    }

    public String getGatewayCustomer() {
        return gatewayCustomer;
    }

    public void setGatewayCustomer(String gatewayCustomer) {
        this.gatewayCustomer = gatewayCustomer;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    private String gatewayToken;
    private String gatewayCustomer;
    private String paymentMethod;
    private String name;
    private BillingAddress billingAddress;

}
