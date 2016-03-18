package demo

import groovy.util.logging.Slf4j
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by jc on 3/11/16.
 */
@RestController
@Slf4j
@RequestMapping(value = "/apihealth")
class HealthController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        "OK"
    }

    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public String version() {
        "0.12.4"
    }

}
