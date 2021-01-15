package xyz.teamgravity.daggerhilt

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import javax.inject.Named

class TestViewModel @ViewModelInject constructor(
    @Named("hobby") hobby: String
) : ViewModel() {

    init {
        println("debug: hobby in TestViewModel: $hobby")
    }
}