package org.izumi.cuba.extend.entity;

import com.haulmont.cuba.core.entity.annotation.Extends;
import com.haulmont.cuba.security.entity.UserSubstitution;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("extend_Substitution")
@Entity(name = "extend_Substitution")
@Extends(UserSubstitution.class)
public class Substitution extends UserSubstitution {
    private static final long serialVersionUID = -6988704102381077439L;

    @Column(name = "ADDITIONAL")
    private String additional;

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }
}
