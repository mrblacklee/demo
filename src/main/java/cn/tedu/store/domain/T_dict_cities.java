package cn.tedu.store.domain;

public class T_dict_cities {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dict_cities.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dict_cities.province_code
     *
     * @mbg.generated
     */
    private String provinceCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dict_cities.city_code
     *
     * @mbg.generated
     */
    private String cityCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dict_cities.city_name
     *
     * @mbg.generated
     */
    private String cityName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dict_cities.id
     *
     * @return the value of t_dict_cities.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dict_cities.id
     *
     * @param id the value for t_dict_cities.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dict_cities.province_code
     *
     * @return the value of t_dict_cities.province_code
     *
     * @mbg.generated
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dict_cities.province_code
     *
     * @param provinceCode the value for t_dict_cities.province_code
     *
     * @mbg.generated
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dict_cities.city_code
     *
     * @return the value of t_dict_cities.city_code
     *
     * @mbg.generated
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dict_cities.city_code
     *
     * @param cityCode the value for t_dict_cities.city_code
     *
     * @mbg.generated
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dict_cities.city_name
     *
     * @return the value of t_dict_cities.city_name
     *
     * @mbg.generated
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dict_cities.city_name
     *
     * @param cityName the value for t_dict_cities.city_name
     *
     * @mbg.generated
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }
}