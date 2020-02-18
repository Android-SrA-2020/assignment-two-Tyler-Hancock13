package school.nbcc.rickandmorty


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import school.nbcc.rickandmorty.databinding.FragmentCheatBinding

/**
 * A simple [Fragment] subclass.
 */
class CheatFragment : Fragment() {

    private lateinit var binding: FragmentCheatBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_cheat,
            container,
            false
        )

        return binding.root
    }
}
