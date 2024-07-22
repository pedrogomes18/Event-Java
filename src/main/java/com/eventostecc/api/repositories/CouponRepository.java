package com.eventostecc.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.eventostecc.api.domain.coupon.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, UUID>{
    List<Coupon> findByEventIdAndValidAfter(UUID eventId, Date currentDate);
}
