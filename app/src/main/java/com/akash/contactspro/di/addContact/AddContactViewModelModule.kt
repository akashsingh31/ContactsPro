package com.akash.contactspro.di.addContact

import androidx.lifecycle.ViewModel
import com.akash.contactspro.di.ViewModelKey
import com.akash.contactspro.ui.addContact.AddContactViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AddContactViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(AddContactViewModel::class)
    abstract fun bindAddContactViewModel(addContactViewModel: AddContactViewModel): ViewModel

}