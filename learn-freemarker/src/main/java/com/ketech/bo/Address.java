package com.ketech.bo;

/**
 * 包名: com.ketech.bo <br/>
 * 类名: Address <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年10月11日 <br/>
 * 描述: 地址类 <br/>.
 */

public class Address {

    private String country;
    private String city;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }
}
