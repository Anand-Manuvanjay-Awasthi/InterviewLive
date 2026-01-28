package com.interviewlive.SchedulingInterview.Controller;

import com.interviewlive.SchedulingInterview.DTOs.InterviewRequest;
import com.interviewlive.SchedulingInterview.DTOs.InterviewScheduleRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterviewScheduleController {
    @Autowired
    private ScheduleService scheduleService;
    @PostMapping("/Interview/schedule")
    public ResponseEntity<InterviewScheduleRes> scheduleInterview(@RequestBody InterviewRequest request) {
        try{
            InterviewScheduleRes res = scheduleService.schedule(request);
            if("SUCCESS".equals(res.getStatus())) ResponseEntity.ok(res);
        }
        catch(Exception e){
            InterviewScheduleRes res = new InterviewScheduleRes();
            res.setStatus("FAILED");
            res.setMessage(e.getMessage());
            ResponseEntity.internalServerError().body(res);
        }
    }
}
