package com.example.agenda.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.agenda.R
import com.example.agenda.model.Contact
import com.example.agenda.model.ContactDAO
import kotlinx.android.synthetic.main.fragment_agenda_list.*
import kotlinx.android.synthetic.main.fragment_contact_info.*

class ContactInfoFragment : Fragment() {

    var contactDao : ContactDAO = ContactDAO()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var myView: View = inflater.inflate(
            R.layout.fragment_contact_info, container, false)

        return myView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initInfo()
    }

    fun show(position: Int) {
        var contact : Contact = contactDao.contacts.get(position)
        txt_agenda_nome.text = contact.name
        txt_agenda_nome.visibility = View.VISIBLE
        txt_agenda_E_mail.text = contact.email
        txt_agenda_E_mail.visibility = View.VISIBLE
        txt_agenda_Telefone.text = contact.phone
        txt_agenda_Telefone.visibility = View.VISIBLE

    }

    fun initInfo() {
        show(0)
    }
}