package com.service.theserviceside.test;


import com.service.theserviceside.test.testEntity.TestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author duanqihang
 * Created with IntelliJ IDEA.
 * User: suse_QiHang
 * Date: 2022/4/13 22:33
 * Description:
 */
@Controller
@RequestMapping(value = "/test")
public class TestApi {
    @ResponseBody
    @GetMapping("/testJson")
    private TestEntity Test(){
        return new TestEntity(200, "success!");
    }
}
