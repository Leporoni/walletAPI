package com.wallet.dto;

import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

	private Long id;
	
	@Email(message = "e-mail inválido")
	private String email;
	
	@Length(min = 3, max = 50, message = "O nome deve conter entre 3 e 50 caracteres")
	private String name;
	
	@NotNull
	@Length(min = 6, message = "A senha deve conter no mínimo 6 caracteres")
	private String password;
}
