/**
 * Copyright 2016 vip.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 *  the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * </p>
 **/

package com.vip.saturn.job.console.service;

import com.vip.saturn.job.console.exception.SaturnJobConsoleException;
import com.vip.saturn.job.console.mybatis.entity.Role;
import com.vip.saturn.job.console.mybatis.entity.UserRole;

import java.util.List;

/**
 * @author hebelala
 */
public interface AuthorizationManageService {

	void addUserRole(UserRole userRole) throws SaturnJobConsoleException;

	void deleteUserRole(UserRole userRole) throws SaturnJobConsoleException;

	void updateUserRole(UserRole pre, UserRole cur) throws SaturnJobConsoleException;

	List<Role> getRoles() throws SaturnJobConsoleException;

	List<UserRole> getUserRoles(String userName, String roleKey, String namespace) throws SaturnJobConsoleException;
}
