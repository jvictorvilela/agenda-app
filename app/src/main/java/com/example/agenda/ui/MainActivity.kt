package com.example.agenda.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.agenda.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_entrar.setOnClickListener {
            // abre Dialog perguntando o nome do usuário
            openUserNameDialog()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.actions, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id = item.itemId

        if (id == R.id.action_fechar) {
            openExitDialog()
        }
        return super.onOptionsItemSelected(item)
    }

    fun openUserNameDialog() {
        UserNameDialog.show(supportFragmentManager, object : UserNameDialog.OnTextListener {
            override fun onSetTExt(name: String) {
                intent = Intent(applicationContext, AgendaActivity::class.java)
                intent.putExtra("name", name)
                startActivity(intent)
            }
        })
    }

    fun openExitDialog() {
        ExitDialog.show(supportFragmentManager)
    }
}
