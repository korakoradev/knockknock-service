package knockknock;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@RestController
public class KnockKnockController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Knock-Knock";
    }

    @RequestMapping(value = "/api/get1/node/{node}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    String get1(@PathVariable(value = "node") String node) {
        return "get1";
    }
}
