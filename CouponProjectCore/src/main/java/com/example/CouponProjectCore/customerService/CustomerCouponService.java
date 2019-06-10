package com.example.CouponProjectCore.customerService;

import java.util.Set;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.CouponProjectCore.customerDAO.CustomerCouponDAO;
import com.example.CouponProjectCore.entity.Coupon;
import com.example.CouponProjectCore.entity.CustomerCoupon;

@Service
public class CustomerCouponService {

	public class CustomerCouponDBDAO implements CustomerCouponDAO {
		
		private EntityManager entityManager;
	
		@Transactional
		public void createCustomerCoupon(long custId, long couponId) {
			
		}

		@Override
		public void removeCustomerCoupon(long custId, long couponId) {

		}

		public Set<CustomerCoupon> getAll() {
			return null;

		}

		public void removeCustomerCouponById(long coupId) {

		}

		@Override
		public Set<CustomerCoupon> getCustomerCoupon(long custId) {

			return null;
		}
	}
}
