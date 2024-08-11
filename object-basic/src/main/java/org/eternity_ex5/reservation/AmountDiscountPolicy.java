package org.eternity_ex5.reservation;

import org.eternity_ex5.generic.Money;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
