package io.naztech.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Customer {
	int c_id;
	String c_name;
	String c_street;
	String c_city;
}
