package com.aladin.email.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailRequestDto {
	@NotBlank
	@Email
	private String email;

	@NotBlank
	private String username;

	private LocalDateTime authExpireDate;
	private String authCode;
}