package com.chris.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @Auther Chris Lee
 * @Date 7/25/2018 17:24
 * @Description
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Spitter {
	private Long id;
	
	@NotNull
	@Size(min = 5, max = 16)
	private String username;
	
	@NotNull
	@Size(min = 5, max = 25)
	private String password;
	
	@NotNull
	@Size(min = 2, max = 30)
	private String firstName;
	
	@NotNull
	@Size(min = 2, max = 30)
	private String lastName;
	
	@NotNull
	@Email
	private String email;
}
