package com.example.agenda.ui

import android.app.Dialog
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import com.example.agenda.R

class ExitDialog : DialogFragment() {


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity!!)
        builder.setTitle("Tem certeza que deseja sair?")

        builder.setPositiveButton("Sim") { dialogInterface, i ->
            System.exit(0)
        }

        builder.setNegativeButton("Cancelar") { dialogInterface, i -> dismiss() }

        return builder.create()
    }

    interface OnTextListener {
        fun onSetTExt(text: String)
    }

    companion object {

        fun show(fm: FragmentManager) {

            val dialog = ExitDialog()
            dialog.show(fm, "textDialog")

        }
    }
}
