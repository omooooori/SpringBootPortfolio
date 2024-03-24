package org.omooooori.springbootportfolio.domain.issue

class IssueService {
    fun findAll(): List<Issue> {
        return listOf(
            Issue(
                id = 1,
                summary = "summary1",
                description = "description1"
            ),
            Issue(
                id = 2,
                summary = "summary2",
                description = "description2"
            ),
            Issue(
                id = 3,
                summary = "summary3",
                description = "description3"
            )
        )
    }
}