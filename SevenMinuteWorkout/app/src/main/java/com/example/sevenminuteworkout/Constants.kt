package com.example.sevenminuteworkout

object Constants {

    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val halos = ExerciseModel(
            1,
            "halos",
            R.drawable.halos,
            false,
            false
        )
        exerciseList.add(halos)

        val reverseCorkscrews = ExerciseModel(
            2,
            "Reverse Corkscrews",
            R.drawable.reverse_corkscrew,
            false,
            false
        )
        exerciseList.add(reverseCorkscrews)

        val plankReachouts = ExerciseModel(
            3,
            "Plank Reachouts",
            R.drawable.plankreachout,
            false,
            false
        )
        exerciseList.add(reverseCorkscrews)

        val chainsaws = ExerciseModel(
            4,
            "Chainsaws",
            R.drawable.chainsaws,
            false,
            false
        )
        exerciseList.add(chainsaws)

        val situpRollups = ExerciseModel(
            5,
            "Situp Rollups",
            R.drawable.situp_rollup,
            false,
            false
        )
        exerciseList.add(situpRollups)

        return exerciseList
    }
}