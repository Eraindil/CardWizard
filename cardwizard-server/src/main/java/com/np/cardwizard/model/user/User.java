package com.np.cardwizard.model.user;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class User extends AdminUser implements Serializable {
  private static final long serialVersionUID = 1L;

  public User() {

  }
}
