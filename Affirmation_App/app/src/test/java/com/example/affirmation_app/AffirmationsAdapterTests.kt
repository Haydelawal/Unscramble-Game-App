package com.example.affirmation_app

import android.content.Context
import com.example.affirmation_app.adapter.ItemAdapter
import com.example.affirmation_app.model.Affirmation
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {

    private val context = mock(Context::class.java)

    @Test
    fun adapter_size(){
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )

        val adapter = ItemAdapter(context, data)

//        /**
//         * Return the size of your dataset (invoked by the layout manager)
//         */
//        override fun getItemCount() = dataset.size

        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }


}