package com.akash.contactspro.di

import com.akash.contactspro.di.addContact.AddContactViewModelModule
import com.akash.contactspro.di.contactDetails.ContactDetailsViewModelModule
import com.akash.contactspro.di.contactsList.ContactsListViewModelModule
import com.akash.contactspro.ui.addContact.AddContactFragment
import com.akash.contactspro.ui.contactDetails.ContactDetailsFragment
import com.akash.contactspro.ui.contactsList.ContactsListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {

    @ContributesAndroidInjector(modules = [ContactsListViewModelModule::class])
    abstract fun contributeContactsFragment() : ContactsListFragment

    @ContributesAndroidInjector(modules = [AddContactViewModelModule::class])
    abstract fun contributeAddContactFragment() : AddContactFragment

    @ContributesAndroidInjector(modules = [ContactDetailsViewModelModule::class])
    abstract fun contributeContactDetailsFragment() : ContactDetailsFragment
}