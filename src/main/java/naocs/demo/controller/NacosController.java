package naocs.demo.controller;


import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/5
 * @desc   从nacos 获取数据
 */
@RestController
@RefreshScope //动态刷新
public class NacosController {

    @Value("${info.name}")
    private String infoName;
    @GetMapping("/say")
    public String sayName(){
        System.err.println("从远程服务器拉取到的配置内容为："+infoName);
        return  infoName;
    }
}
