package cn.me.controller;

import cn.me.execption.MessageException;
import cn.me.pojo.Json;
import cn.me.pojo.QueryVo;
import cn.me.pojo.User;
import cn.me.service.UserService;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/userList.action")
    public String queryUserList(Model model){
        List<User> userList = userService.findUsers();
        model.addAttribute("userList",userList);
        return "userList";
    }
    @RequestMapping("/form.action")
    public String form(){ return "form"; }

    @RequestMapping("/findBy.action")
    public @ResponseBody Json findBy(Model model, @RequestBody Json json){
        System.out.println(json.toString());
        return json;
    }
    @RequestMapping("/pic.action")
    public String pic(Model model, MultipartFile pic) throws IOException {
        String s = UUID.randomUUID().toString().replaceAll("-", "");
        String extName = FilenameUtils.getExtension(pic.getOriginalFilename());
        pic.transferTo(new File("D:\\web\\upload\\"+s+"."+extName));
        User user =  new User();
        user.setPic(s+"."+extName);
        model.addAttribute("user",user);
        return "pic";
    }
}
