package org.omooooori.springbootportfolio.domain.issue

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface IssueRepository {
    @Select("select * from issues")
    fun findAll(): List<Issue>

    @Insert("insert into issues (summary, description) values (#{summary}, #{description})")
    fun insert(summary: String, description: String)
}