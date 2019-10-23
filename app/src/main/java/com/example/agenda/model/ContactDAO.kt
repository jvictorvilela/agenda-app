package com.example.agenda.model

class ContactDAO {
    var contacts : ArrayList<Contact> = ArrayList()
    constructor() {
        contacts.add(Contact("Maria", "maria@gmail.com.br", "84 198272834"))
        contacts.add(Contact("Pedro", "pedro123@gmail.com.br", "84 283743534"))
        contacts.add(Contact("José", "jose3453@teste.com.br", "84 645475523"))
        contacts.add(Contact("Júlia", "julia@hotmail.com.br", "84 2354565345"))
        contacts.add(Contact("Roberto", "roberto@gmail.com.br", "84 365536453"))
        contacts.add(Contact("André", "andre321@gmail.com.br", "84 23434523423"))
        contacts.add(Contact("Carlos", "carlos@gmail.com.br", "84 23847545234"))
        contacts.add(Contact("Luana", "luana@gmail.com.br", "84 097978686"))
        contacts.add(Contact("Jéferson", "jeferson@gmail.com.br", "84 356464723"))
        contacts.add(Contact("Yasmin", "yasmin@hotmail.com.br", "84 278364535"))
        contacts.add(Contact("Suzana", "suzana@gmail.com.br", "84 987323434"))
        contacts.add(Contact("Aline", "aline@gmail.com.br", "84 234534645"))
        contacts.add(Contact("Paulo", "paulo@gmail.com.br", "84 364564465"))
        contacts.add(Contact("João Victor", "jv@gmail.com.br", "84 0927489375"))
        contacts.add(Contact("Thiago", "thiago@gmail.com.br", "84 29837453345"))
    }
}