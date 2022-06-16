package com.example.saucelabsdemo

import androidx.leanback.widget.AbstractDetailsDescriptionPresenter

class DetailsDescriptionPresenter : AbstractDetailsDescriptionPresenter() {

    override fun onBindDescription(
        viewHolder: AbstractDetailsDescriptionPresenter.ViewHolder,
        item: Any
    ) {
        val person = item as Person

        viewHolder.title.text = person.title
        viewHolder.subtitle.text = person.studio
        viewHolder.body.text = person.description
    }
}