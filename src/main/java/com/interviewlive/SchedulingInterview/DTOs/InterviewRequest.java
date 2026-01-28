package com.interviewlive.SchedulingInterview.DTOs;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InterviewRequest {
    private String candidateName;
    private String candidateEmail;
    private String position;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private String interviewerEmail;
    private String description;

}
