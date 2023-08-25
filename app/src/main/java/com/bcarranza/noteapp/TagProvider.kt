package com.bcarranza.noteapp

class TagProvider {

    companion object {
        val tagsList = listOf<Tag>(
            Tag(
                R.string.all_tag
            ),
            Tag(
                R.string.work_tag
            ),
            Tag(
                R.string.personal_tag
            ),
            Tag(
                R.string.fitness_tag
            ),
            Tag(
                R.string.budget_tag
            )
        )
    }
}