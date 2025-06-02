package br.com.allidev.techevents.domain.coupon;

public record CouponRequestDTO(String code, Integer discount, Long valid) {
}
