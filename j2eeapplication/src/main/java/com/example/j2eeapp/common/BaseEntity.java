package com.example.j2eeapp.common;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Base entity type to hold common ID property. To be Extended.
 * 
 * @author dan
 *
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = -8645988386763833160L;
	
	@Id
	@GeneratedValue
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
