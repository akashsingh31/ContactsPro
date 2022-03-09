package com.akash.contactspro.di.contactDetails

import androidx.lifecycle.ViewModel
import com.akash.contactspro.di.ViewModelKey
import com.akash.contactspro.ui.contactDetails.ContactDetailsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ContactDetailsViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(ContactDetailsViewModel::class)
    abstract fun bindContactDetailsViewModel(contactDetailsViewModel: ContactDetailsViewModel): ViewModel
}