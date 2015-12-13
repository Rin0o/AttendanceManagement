/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author David
 */
@Entity
public class UserGroup implements Serializable {

    public enum GROUP {
        Administrator, EventManager, Attendant;
    }
    
    @Id
    @Enumerated(EnumType.STRING)
    private GROUP groupName;
    @Id
    @OneToOne
    @JoinColumn(name = "USERNAME")
    private User user;

    public UserGroup(GROUP groupName, User user) {
        this.groupName = groupName;
        this.user = user;
    }
    
    


}
