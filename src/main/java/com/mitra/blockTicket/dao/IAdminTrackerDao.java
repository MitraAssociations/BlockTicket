/**
 * 
 */
package com.mitra.blockTicket.dao;

import com.mitra.blockTicket.entity.User;

/**
 * @author Imransha This interface used for logging admin pagea
 *
 */
public interface IAdminTrackerDao {

	public User connect(String name, String pwd, String ipaddress); // need to change the data type for ipaddress

}
