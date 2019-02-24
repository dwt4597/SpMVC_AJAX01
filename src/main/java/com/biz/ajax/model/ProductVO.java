package com.biz.ajax.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data  // 가급적 사용하지 말기.. 필요없는 여러가지 내부 method를 생성해서, vo를 상당히 무겁게 만든다.
@Getter
@Setter
@NoArgsConstructor // member 생성자
@AllArgsConstructor // super 생성자
@ToString
public class ProductVO {
	private String p_ccode;
	private String p_cname;
	private String p_vat;
	private String p_iprice;
	private String p_oprice;
}
