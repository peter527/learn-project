package com.ketech.po;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table country
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Country implements Serializable {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   国家名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.countryname
     *
     * @mbg.generated
     */
    private String countryname;

    /**
     * Database Column Remarks:
     *   国家代码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.countrycode
     *
     * @mbg.generated
     */
    private String countrycode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table country
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.id
     *
     * @return the value of country.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.id
     *
     * @param id the value for country.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.countryname
     *
     * @return the value of country.countryname
     *
     * @mbg.generated
     */
    public String getCountryname() {
        return countryname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.countryname
     *
     * @param countryname the value for country.countryname
     *
     * @mbg.generated
     */
    public void setCountryname(String countryname) {
        this.countryname = countryname == null ? null : countryname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.countrycode
     *
     * @return the value of country.countrycode
     *
     * @mbg.generated
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.countrycode
     *
     * @param countrycode the value for country.countrycode
     *
     * @mbg.generated
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }
}