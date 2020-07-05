package com.teacherblitz.controller;

import cn.hutool.core.bean.BeanUtil;
import com.teacherblitz.entity.Users;
import com.teacherblitz.entity.vo.UserVo;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * sso 登录
 *
 * @author teacherblitz
 * @since 2020/7/5
 */
public class LoginController {

    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response){
        return "login";
    }

    public String doLogin(@RequestParam String userName, @RequestParam String passWord){
        if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(passWord)){
            return "login";
        }
        // 登录
        Users users = new Users();
        UserVo userVo = new UserVo();
        BeanUtil.copyProperties(users, userVo);
        String uniqueToken = UUID.randomUUID().toString();
        userVo.setUserUniqueToken(uniqueToken);
        // 存入redis

        return "";
    }

}
