package io.horizontalsystems.bankwallet.modules.address

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import io.horizontalsystems.bankwallet.core.factories.AddressParserFactory
import io.horizontalsystems.marketkit.models.CoinType

object AddressParserModule {
    class Factory(private val coinType: CoinType) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            val factory = AddressParserFactory()
            return AddressParserViewModel(factory.parser(coinType)) as T
        }
    }
}