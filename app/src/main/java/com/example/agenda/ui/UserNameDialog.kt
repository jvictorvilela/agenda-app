package com.example.agenda.ui

import android.app.Dialog
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import com.example.agenda.R

class UserNameDialog : DialogFragment() {

    private var editText: EditText? = null
    private var listener: OnTextListener? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity!!)
        builder.setTitle("Digite seu nome: ")

        builder.setPositiveButton("Entrar") { dialogInterface, i ->
            if (listener != null) {
                val text = editText!!.text.toString()
                listener!!.onSetTExt(text)
            }
        }

        builder.setNegativeButton("Cancelar") { dialogInterface, i -> dismiss() }

        val view = activity!!.layoutInflater.inflate(R.layout.dialog_user_name, null)
        editText = view.findViewById(R.id.edt_texto)
        builder.setView(view)
        return builder.create()
    }

    interface OnTextListener {
        fun onSetTExt(text: String)
    }

    companion object {

        fun show(fm: FragmentManager, listener: OnTextListener) {

            val dialog = UserNameDialog()
            dialog.listener = listener
            dialog.show(fm, "textDialog")

        }
    }
}
