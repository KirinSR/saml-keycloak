package com.sso.spring.boot.security.saml.web.user.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "global_roles")
public class GlobalRoles
{
    @Id
    private String _id;
    private String roleName;



    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    @Override
    public String toString() {
        return "GlobalRoles{" +
                "_id=" + _id +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
