package xyz.teamgravity.daggerhilt

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import xyz.teamgravity.daggerhilt.databinding.ActivityMainBinding
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Inject
    @Named("name")
    lateinit var name: String

    @Inject
    @Named("surname")
    lateinit var surname: String

    @Inject
    @Named("car")
    lateinit var car: String

    private val testViewModel by viewModels<TestViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        println("debug: testViewModel injected: $testViewModel")
        println("debug: name: $name")
        println("debug: surname: $surname")
        println("debug: $car")
    }
}