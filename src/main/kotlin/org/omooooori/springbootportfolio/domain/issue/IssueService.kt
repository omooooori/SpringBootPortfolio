package org.omooooori.springbootportfolio.domain.issue

import org.springframework.stereotype.Service

@Service
class IssueService(
    private val issueRepository: IssueRepository
) {
    fun findAll(): List<Issue> = issueRepository.findAll()
}