package com.example.dao.user.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "real_name")
    private String realName;

    private String gender;

    private String password;

    @Column(name = "small_image")
    private String smallImage;

    private String email;

    private String phone;

    private String mobile;

    private String qq;

    private String msn;

    @Column(name = "last_login_dt")
    private Date lastLoginDt;

    @Column(name = "access_token")
    private String accessToken;

    @Column(name = "user_type")
    private String userType;

    private Short enabled;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_dt")
    private Date createDt;

    @Column(name = "modify_by")
    private String modifyBy;

    @Column(name = "modify_dt")
    private Date modifyDt;

    @Column(name = "org_id")
    private Integer orgId;

    @Column(name = "group_id")
    private Integer groupId;

    private String salt;

    @Column(name = "nick_name")
    private String nickName;

    /**
     * 友互通用户唯一标识
     */
    @Column(name = "yht_user_id")
    private String yhtUserId;

    /**
     * 对应租户ID
     */
    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "core_user_id")
    private String coreUserId;

    /**
     * 删除标记
     */
    private Integer dr;

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return real_name
     */
    public String getRealName() {
        return realName;
    }

    /**
     * @param realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return small_image
     */
    public String getSmallImage() {
        return smallImage;
    }

    /**
     * @param smallImage
     */
    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return qq
     */
    public String getQq() {
        return qq;
    }

    /**
     * @param qq
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * @return msn
     */
    public String getMsn() {
        return msn;
    }

    /**
     * @param msn
     */
    public void setMsn(String msn) {
        this.msn = msn;
    }

    /**
     * @return last_login_dt
     */
    public Date getLastLoginDt() {
        return lastLoginDt;
    }

    /**
     * @param lastLoginDt
     */
    public void setLastLoginDt(Date lastLoginDt) {
        this.lastLoginDt = lastLoginDt;
    }

    /**
     * @return access_token
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * @param accessToken
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * @return user_type
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return enabled
     */
    public Short getEnabled() {
        return enabled;
    }

    /**
     * @param enabled
     */
    public void setEnabled(Short enabled) {
        this.enabled = enabled;
    }

    /**
     * @return create_by
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * @return create_dt
     */
    public Date getCreateDt() {
        return createDt;
    }

    /**
     * @param createDt
     */
    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    /**
     * @return modify_by
     */
    public String getModifyBy() {
        return modifyBy;
    }

    /**
     * @param modifyBy
     */
    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    /**
     * @return modify_dt
     */
    public Date getModifyDt() {
        return modifyDt;
    }

    /**
     * @param modifyDt
     */
    public void setModifyDt(Date modifyDt) {
        this.modifyDt = modifyDt;
    }

    /**
     * @return org_id
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * @param orgId
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * @return group_id
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * @param groupId
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * @return salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @param salt
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * @return nick_name
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取友互通用户唯一标识
     *
     * @return yht_user_id - 友互通用户唯一标识
     */
    public String getYhtUserId() {
        return yhtUserId;
    }

    /**
     * 设置友互通用户唯一标识
     *
     * @param yhtUserId 友互通用户唯一标识
     */
    public void setYhtUserId(String yhtUserId) {
        this.yhtUserId = yhtUserId;
    }

    /**
     * 获取对应租户ID
     *
     * @return tenant_id - 对应租户ID
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * 设置对应租户ID
     *
     * @param tenantId 对应租户ID
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * @return core_user_id
     */
    public String getCoreUserId() {
        return coreUserId;
    }

    /**
     * @param coreUserId
     */
    public void setCoreUserId(String coreUserId) {
        this.coreUserId = coreUserId;
    }

    /**
     * 获取删除标记
     *
     * @return dr - 删除标记
     */
    public Integer getDr() {
        return dr;
    }

    /**
     * 设置删除标记
     *
     * @param dr 删除标记
     */
    public void setDr(Integer dr) {
        this.dr = dr;
    }
}