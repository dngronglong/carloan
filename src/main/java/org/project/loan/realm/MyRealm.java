package org.project.loan.realm;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.project.loan.beans.UserBean;
import org.project.loan.usermag.service.IUserReadService;



public class MyRealm extends AuthorizingRealm {
	
	@Resource
    private IUserReadService userReadService;

	@Override//授权
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		   String username = (String) principals.getPrimaryPrincipal(); //获取用户名
	        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
	        authorizationInfo.setRoles(userReadService.getRoles(username));
	        authorizationInfo.setStringPermissions(userReadService.getPermissions(username));
        System.out.println(authorizationInfo+"-----------------------------");
        System.out.println(userReadService.getRoles(username)+"-----------------------------");
        System.out.println(userReadService.getPermissions(username)+"-----------------------------");
	        return authorizationInfo;
	}

	@Override//认证
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		  String username = (String) token.getPrincipal(); // 获取用户名
	        UserBean user = userReadService.getByUsername(username);
	        if(user != null) {
	            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getUserLoginName(), user.getUserPassword(), "myRealm");
	            return authcInfo;
	           
	        } else {
	            return null;
	        }       
	    }
	}


