package top.gjp0609.eureka_consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.gjp0609.eureka_consumer.remote.HelloRemote;

@RestController
public class ConsumerController {

    final
    HelloRemote helloRemote;

    @Autowired
    public ConsumerController(HelloRemote helloRemote) {
        this.helloRemote = helloRemote;
    }

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }

}