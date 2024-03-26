package org.omooooori.springbootportfolio.domain.issue

import jakarta.validation.constraints.NotEmpty

data class IssueForm(
    @field:NotEmpty
    var summary: String,
    @field:NotEmpty
    var description: String
)
