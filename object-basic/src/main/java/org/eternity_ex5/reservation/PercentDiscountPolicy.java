package org.eternity_ex5.reservation;

import org.eternity_ex5.generic.Money;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getFixedFee().times(percent);
    }
}
