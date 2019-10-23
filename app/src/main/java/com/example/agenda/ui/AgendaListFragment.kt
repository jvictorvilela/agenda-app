package com.example.agenda.ui

import android.content.Context
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
import java.lang.RuntimeException

class AgendaListFragment : Fragment(){

    var listener : OnContactInfoListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context !is OnContactInfoListener) {
            throw RuntimeException("Não é um OnContactInfoListener")
        }

        listener = context as OnContactInfoListener

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var myView: View = inflater.inflate(
            R.layout.fragment_agenda_list, container, false)

        return myView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        var arrayAdapter = ArrayAdapter<Contact>(activity!!.applicationContext, android.R.layout.simple_list_item_1, ContactDAO().contacts)
        activity!!.list_contacts.adapter = arrayAdapter
        super.onActivityCreated(savedInstanceState)

        activity!!.list_contacts.setOnItemClickListener { parent, view, position, id ->
            listener?.displayContactInfo(position)
        }
    }

    interface OnContactInfoListener {
        fun displayContactInfo(position: Int):Unit
    }
}