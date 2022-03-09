package com.akash.contactspro.di.contactsList

import androidx.lifecycle.ViewModel
import com.akash.contactspro.di.ViewModelKey
import com.akash.contactspro.ui.contactsList.ContactsListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ContactsListViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(ContactsListViewModel::class)
    abstract fun bindContactsListViewModel(contactsListViewModel: ContactsListViewModel): ViewModel

}