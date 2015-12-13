package com.thedeadpixelsociety.ld34

import com.thedeadpixelsociety.ld34.screens.GameScreenService
import com.thedeadpixelsociety.ld34.screens.LevelScreen

object LevelManager {
    const val MAX_LEVELS = 2
    var currentLevel = 0
        get
        private set

    fun next() {
        currentLevel++
        if (currentLevel > MAX_LEVELS) currentLevel = 0

        GameServices[GameScreenService::class].push(LevelScreen("$currentLevel"))
    }

    fun previous() {
        currentLevel--
        if (currentLevel <= 0) currentLevel = 0

        GameServices[GameScreenService::class].push(LevelScreen("$currentLevel"))
    }

    fun retry() {
        GameServices[GameScreenService::class].push(LevelScreen("$currentLevel"))
    }
}