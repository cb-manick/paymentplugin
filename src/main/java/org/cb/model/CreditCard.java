package org.cb.model;

public class CreditCard {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getFundingType() {
        return fundingType;
    }

    public void setFundingType(String fundingType) {
        this.fundingType = fundingType;
    }

    public String getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(String paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    private String last4;
    private String gatewayToken;
    private String gatewayCustomer;
    private BillingAddress billingAddress;
    private String fundingType;
    private String paymentMethodType;
}
