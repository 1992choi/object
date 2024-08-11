package org.eternity_ex5.reservation;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
