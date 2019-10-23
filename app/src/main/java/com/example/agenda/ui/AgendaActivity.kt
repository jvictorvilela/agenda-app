package com.example.agenda.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.agenda.R
import kotlinx.android.synthetic.main.activity_agenda.*
import kotlinx.android.synthetic.main.fragment_agenda_list.*

class AgendaActivity : AppCompatActivity(), AgendaListFragment.OnContactInfoListener {

    var contactInfoFragment : ContactInfoFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)

        contactInfoFragment = supportFragmentManager.findFragmentById(R.id.frag_contact_info) as ContactInfoFragment

        //setando nome do usuário
        txt_nome_usuario.text = txt_nome_usuario.text.toString()+intent.getStringExtra("name")
    }

    override fun displayContactInfo(position: Int) {
        contactInfoFragment!!.show(position)
    }

}
