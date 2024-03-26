package org.omooooori.springbootportfolio.web.issue

import jakarta.validation.Valid
import org.omooooori.springbootportfolio.domain.issue.Issue
import org.omooooori.springbootportfolio.domain.issue.IssueForm
import org.omooooori.springbootportfolio.domain.issue.IssueService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/issues")
class IssueController(
    private val issueService: IssueService
) {
    @GetMapping
    fun showList(model: Model): String {
        model.addAttribute("issueList", issueService.findAll())
        return "issues/list"
    }

    @GetMapping("/creationForm")
    fun showCreationForm(model: Model): String {
        val issueForm = IssueForm(summary = "", description = "")
        model.addAttribute("issueForm", issueForm)
        return "issues/creationForm"
    }

    @PostMapping
    fun create(
        @ModelAttribute @Valid form: IssueForm,
        bindingResult: BindingResult,
        model: Model
    ): String {
        if (bindingResult.hasErrors()) {
            return "issues/creationForm"
        }
        issueService.create(form.summary, form.description)
        return "redirect:/issues"
    }
}