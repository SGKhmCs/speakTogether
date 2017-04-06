package com.sgcs.speaktogether.cucumber.stepdefs;

import com.sgcs.speaktogether.SpeakTogetherApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SpeakTogetherApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
