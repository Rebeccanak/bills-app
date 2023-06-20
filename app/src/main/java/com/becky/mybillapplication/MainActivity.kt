package com.becky.mybillapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class interesting : AppCompatActivity() {
    lateinit var tvnextsecondpage:TextView
    lateinit var tvnextin:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvnextinteresting=findViewById(R.id.tvnextinterest)
        tvnextin=findViewById(R.id.tvnextin)
        tvnextinteresting.setOnClickListener {
            val  intent= Intent(this,nextpage::class.java)
            startActivity(intent)
        }
        tvnextin.setOnClickListener {
            val  intent= Intent(this,previous ::class.java)
            startActivity(intent)
        }

    }

}

}


















































//class interesting : AppCompatActivity() {
//    lateinit var tvnextinteresting:TextView
//    lateinit var tvnextin:TextView
//    @SuppressLint("MissingInflatedId")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_interesting)
//        tvnextinteresting=findViewById(R.id.tvnextinterest)
//        tvnextin=findViewById(R.id.tvnextin)
//        tvnextinteresting.setOnClickListener {
//            val  intent= Intent(this,lastpage::class.java)
//            startActivity(intent)
//        }
//        tvnextin.setOnClickListener {
//            val  intent= Intent(this,nextpage::class.java)
//            startActivity(intent)
//        }
//
//    }
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }

    }


//    class AddContacts : AppCompatActivity() {
//        lateinit var binding: ActivityAddContactsBinding
//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//            binding = ActivityAddContactsBinding.inflate(layoutInflater)
//            setContentView(binding.root)
//        }
//        override fun onResume() {
//            super.onResume()
//            setContentView(binding.root)
//            binding.btnsave.setOnClickListener {
//                validateAddContact()
//            }
//        }
//        fun validateAddContact() {
//            val name = binding.etFirstName.text.toString()
//            val name2 = binding.etLastName.text.toString()
//            val phoneNumber = binding.etPhoneNumber.text.toString()
//            val email = binding.etEmail.text.toString()
//            var error = false
//            if (name.isEmpty()) {
//                binding.tilFirstName.error = "First Namerequired"
//                error = true
//            }
//            if (name.isEmpty()) {
//                binding.tilLastName.error = "Last Namerequired"
//                error = true
//            }
//            if (name2.isEmpty()) {
//                binding.tilEmail.error = "Password required"
//                error = true
//            }
//            if (email.isEmpty()) {
//                binding.tilPhoneNumber.error = "Phone Number required"
//                error = true
//            }
//            if (!error) {
//                val intent = Intent(this, AddContacts::class.java)
//                startActivity(intent)
//            }
//            Toast.makeText(this, "Contact added successfully", Toast.LENGTH_SHORT).show();
//            finish();
}