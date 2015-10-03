package com.genericmethod.sendgridplayground;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author cfarrugia
 */

@RestController
public class SendGridEventNotificationController {

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> exception(HttpServletRequest req, Exception e){
        return new ResponseEntity<>("NOT OK - "+e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(name = "/events", method = RequestMethod.POST)
    public ResponseEntity<String> event(@RequestBody List<String> sendGridEventNotification){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

}
