package reyhan.com.data

import reyhan.com.portfolioapp.R

object PortofolioData {
    private val title = arrayOf(
        "Chat App",
        "Travel App",
        "Contact App",
        "Food App",
        "Event Organized App",
        "Daily Profile App",
        "Petshop App",
        "Family Plan App",
        "Task manager App",
        "Office Automation App"
    )

    private val poster = intArrayOf(
        R.drawable.chat,
        R.drawable.travel,
        R.drawable.phoneapp,
        R.drawable.food,
        R.drawable.event,
        R.drawable.dailyprofile,
        R.drawable.petshop,
        R.drawable.familyplan,
        R.drawable.taskmanager,
        R.drawable.office
    )

    private val link = arrayOf(
        "https://search.muz.li/NmU5MmY5YTM4",
        "https://pin.it/3ttUNfs",
        "https://pin.it/77qUdZ7",
        "https://pin.it/2RdMJ7Y",
        "https://pin.it/2LhIJHX",
        "https://pin.it/B8Zq5fV",
        "https://pin.it/6JUvToT",
        "https://pin.it/3tWyoXW",
        "https://pin.it/6xnCZEw",
        "https://pin.it/7pnOqvu"
    )

    val listAppAndroid: ArrayList<Portofolio>
        get() {
            val list = arrayListOf<Portofolio>()
            for (position in title.indices) {
                val android = Portofolio()
                android.title = title[position]
                android.image = poster[position]
                android.link = link[position]
                list.add(android)
            }
            return list
        }

    private val titleExperience = arrayOf(
        "Android Asossiated Developer",
        "Android Pemula",
        "Memulai bahasa pemrograman kotlin",
        "Memulai bahasa pemrograman pyhton",
        "Solid Pricipal",
    )
    private val detailExperience = arrayOf(
        "Sertifikat ini diterbitkan langsung oleh Google untuk development",
        "Sertifikat ini diterbitkan langsung oleh Google untuk development",
        "Sertifikat ini diterbitkan langsung oleh Google untuk development",
        "Sertifikat ini diterbitkan langsung oleh Google untuk development",
        "Sertifikat ini diterbitkan langsung oleh Google untuk development",
    )
    private val imageExperience = arrayOf(
        R.drawable.aad,
        R.drawable.androidcert,
        R.drawable.kotlincert,
        R.drawable.pythoncert,
        R.drawable.solidcert
    )

    val listDataExperience: ArrayList<Portofolio>
        get() {
            val list = arrayListOf<Portofolio>()
            for (position in titleExperience.indices) {
                val experience = Portofolio()
                experience.title = titleExperience[position]
                experience.image = imageExperience[position]
                experience.detail = detailExperience[position]
                list.add(experience)
            }
            return list
        }
}