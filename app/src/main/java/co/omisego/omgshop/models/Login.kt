package co.omisego.omgshop.models

import co.omisego.omgshop.helpers.Constants.REQUEST_KEY_AUTHENTICATION_TOKEN
import co.omisego.omgshop.helpers.Constants.REQUEST_KEY_OMISE_GO_AUTHENTICATION_TOKEN
import co.omisego.omgshop.helpers.Constants.REQUEST_KEY_USER_ID
import com.google.gson.annotations.SerializedName


/**
 * OmiseGO
 *
 * Created by Phuchit Sirimongkolsathien on 11/27/2017 AD.
 * Copyright © 2017 OmiseGO. All rights reserved.
 */

object Login {
    data class Request(val email: String, val password: String)
}
