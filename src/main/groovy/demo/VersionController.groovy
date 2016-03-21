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
@RequestMapping(value = "")
class VersionController {

    def version = "0.1"

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        "Hello World, I'm version ${version}"
    }

    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public String version() {
        version
    }

}
