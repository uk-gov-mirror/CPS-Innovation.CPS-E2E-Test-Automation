package com.cps.fct.e2e.stepdefs.service;

import com.cps.fct.e2e.utils.common.ScenarioContext;
import com.cps.fct.e2e.utils.services.ddei.CaseService;
//import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.And;
//import io.cucumber.messages.ndjson.internal.com.fasterxml.jackson.core.JsonProcessingException;
import org.picocontainer.annotations.Inject;

public class CaseReviewStepDefinition {

    @Inject
    private CaseService caseService;

    @Inject
    private ScenarioContext context;


    @And("precharge the triage case for 28 days PCD review")
    public void prechargeTheTriageCaseForDaysPCD28DaysReview() throws JsonProcessingException {
      caseService.prechargeTheTirageCaseFor28DaysMCAccepted(
              context.get("caseUrn"), context.get("caseId"));
    }

}
