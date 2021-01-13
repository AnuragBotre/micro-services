package com.trendcore.user.vo;

import com.trendcore.user.entity.User;

public class UserDepartmentVO {

    private User user;

    private Department department;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
