package org.omooooori.springbootportfolio.web.issue

import org.omooooori.springbootportfolio.domain.issue.Issue
import org.omooooori.springbootportfolio.domain.issue.IssueService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class IssueController {

    val issueService: IssueService = IssueService()

    // GET / issues
    @GetMapping("/issues")
    fun showList(model: Model): String {
        model.addAttribute("issueList", issueService.findAll())
        return "issues/list"
    }
}