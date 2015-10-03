package com.genericmethod.sendgridplayground;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author cfarrugia
 */

@RestController
public class SendGridEventNotificationController {

    @RequestMapping(name = "/events", method = RequestMethod.POST)
    public ResponseEntity<String> event(@RequestBody List<String> sendGridEventNotification){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

}
