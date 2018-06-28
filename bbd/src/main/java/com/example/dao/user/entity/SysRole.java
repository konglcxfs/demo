package com.example.dao.user.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_role")
public class SysRole {
    @Id
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_desc")
    private String roleDesc;

    /**
     * 所属系统 MALL OP SAAS
     */
    @Column(name = "sys_code")
    private String sysCode;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_dt")
    private Date createDt;

    @Column(name = "modify_by")
    private String modifyBy;

    @Column(name = "modify_dt")
    private Date modifyDt;

    /**
     * 角色组
     */
    @Column(name = "role_group_code")
    private String roleGroupCode;

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
     * @return role_name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return role_desc
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * @param roleDesc
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    /**
     * 获取所属系统 MALL OP SAAS
     *
     * @return sys_code - 所属系统 MALL OP SAAS
     */
    public String getSysCode() {
        return sysCode;
    }

    /**
     * 设置所属系统 MALL OP SAAS
     *
     * @param sysCode 所属系统 MALL OP SAAS
     */
    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
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
     * 获取角色组
     *
     * @return role_group_code - 角色组
     */
    public String getRoleGroupCode() {
        return roleGroupCode;
    }

    /**
     * 设置角色组
     *
     * @param roleGroupCode 角色组
     */
    public void setRoleGroupCode(String roleGroupCode) {
        this.roleGroupCode = roleGroupCode;
    }
}