package com.example.Quiz_Project.dto;

import lombok.Data;

import java.util.List;

@Data
public class SubmitTestDTO {

    private Long testId;

    private Long userId;

    private List<QuestionResponse> responses;
}
