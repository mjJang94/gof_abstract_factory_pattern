package com.mj.gof_abstract_factory_pattern.Factory

import com.mj.gof_abstract_factory_pattern.Snack.LotteSnack
import com.mj.gof_abstract_factory_pattern.Snack.OrionSnack
import com.mj.gof_abstract_factory_pattern.Snack.Snack


class SnackFactory {

    fun createKeyboard(type: String?): Snack? {
        var snack: Snack? = null
        when (type) {
            "LOTTE" -> snack = LotteSnack()
            "ORION" -> snack = OrionSnack()
        }
        return snack
    }
}