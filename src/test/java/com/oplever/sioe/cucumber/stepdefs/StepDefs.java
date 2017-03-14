package com.oplever.sioe.cucumber.stepdefs;

import com.oplever.sioe.SioeApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SioeApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
