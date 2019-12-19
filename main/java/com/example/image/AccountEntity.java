package com.example.image;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="account")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AccountEntity {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="username")
	private String userName;

	@Column(name="password")
//	@JsonIgnore
	private String password;

	@Column(name="enabled")
	private Boolean enabled;

	@Column(name="admin")
	private Boolean admin;



}
