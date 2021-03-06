package co.omisego.omgshop.models

import android.annotation.SuppressLint
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.math.BigDecimal


/**
 * OmiseGO
 *
 * Created by Phuchit Sirimongkolsathien on 11/27/2017 AD.
 * Copyright © 2017 OmiseGO. All rights reserved.
 */
@SuppressLint("ParcelCreator")
object Product {
    object Get {
        data class Response(
                val data: List<Item>
        )

        @Parcelize
        data class Item(
                val id: String,
                val name: String,
                val description: String,
                @SerializedName("image_url") val imageUrl: String,
                val price: Int
        ) : Parcelable
    }

    object Buy {
        data class Request(@SerializedName("token_id") val tokenId: String,
                           @SerializedName("token_value") val tokenValue: BigDecimal,
                           @SerializedName("product_id") val productId: String)

    }
}
