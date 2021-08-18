package com.example.hajiboothibernate;

import javax.persistence.Column;

public class PlanId implements java.io.Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	private String hotelId;

	private String planId;

	public PlanId() {
	}

	public PlanId(String hotelId, String planId) {
		this.hotelId = hotelId;
		this.planId = planId;
	}

	@Column(name = "HOTEL_ID", nullable = false, length = 10)
	public String getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	@Column(name = "PLAN_ID", nullable = false, length = 10)
	public String getPlanId() {
		return this.planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PlanId))
			return false;
		PlanId castOther = (PlanId) other;

		return ((this.getHotelId() == castOther.getHotelId()) || (this.getHotelId() != null
				&& castOther.getHotelId() != null && this.getHotelId().equals(castOther.getHotelId())))
				&& ((this.getPlanId() == castOther.getPlanId()) || (this.getPlanId() != null
						&& castOther.getPlanId() != null && this.getPlanId().equals(castOther.getPlanId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getHotelId() == null ? 0 : this.getHotelId().hashCode());
		result = 37 * result + (getPlanId() == null ? 0 : this.getPlanId().hashCode());
		return result;
	}

}
