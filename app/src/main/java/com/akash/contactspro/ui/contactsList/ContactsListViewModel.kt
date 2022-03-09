package com.akash.contactspro.ui.contactsList

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.akash.contactspro.data.Contact
import com.akash.contactspro.data.Repository
import javax.inject.Inject

class ContactsListViewModel @Inject constructor(private val repository: Repository): ViewModel() {

    val getAllContacts = repository.getAllContacts()

    fun findContactByName(query: String): LiveData<List<Contact>> {
        return repository.findContactByName(query)
    }

}