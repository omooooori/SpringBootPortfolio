package org.omooooori.springbootportfolio.domain.issue

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class IssueService(
    private val issueRepository: IssueRepository
) {
    fun findAll(): List<Issue> = issueRepository.findAll()

    @Transactional
    fun create(summary: String, description: String) = issueRepository.insert(summary, description)
}