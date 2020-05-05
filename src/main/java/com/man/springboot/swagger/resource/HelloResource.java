package com.man.springboot.swagger.resource;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

    @ApiOperation(value = "Return Test")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is ok")
            }
    )
    @GetMapping
    public String hello() {
        return "asd";
    }

    @PostMapping("/post")
    public String helloPost(@RequestBody final String hello) {
        return hello;
    }

    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello) {
        return hello;
    }
}
