package co.develhope.api04.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetSocketAddress;


@RestController
@RequestMapping("/headers")
public class HeadController {

    @GetMapping
    public String getHeader(@RequestHeader HttpHeaders headers) {
        InetSocketAddress host = headers.getHost();
        assert host != null;
        return "The host name is " + host.getHostName() + " and the port used is " + host.getPort();
    }
}