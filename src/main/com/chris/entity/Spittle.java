package com.chris.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

/**
 * @Auther Chris Lee
 * @Date 7/26/2018 14:00
 * @Description
 */
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Spittle {
	
	private final Long id;
	
	private final String message;
	
	private final Date time;
	
	private Double latitude;
	
	private Double longitude;
	
	public boolean equals(Object that) {
		return EqualsBuilder.reflectionEquals(this, that, "id", "time");
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, "id", "time");
	}
}
