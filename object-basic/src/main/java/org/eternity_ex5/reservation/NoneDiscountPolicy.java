package org.eternity_ex5.reservation;

import org.eternity_ex5.generic.Money;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
