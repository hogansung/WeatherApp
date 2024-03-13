import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.R
import com.example.weatherapp.databinding.FragmentAddLocationBinding
import com.example.weatherapp.viewmodel.LocationsViewModel

class AddLocationFragment : Fragment() {

    private val locationsViewModel: LocationsViewModel by lazy {
        ViewModelProvider(requireActivity())[LocationsViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentAddLocationBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_add_location, container, false)
        binding.locationsViewModel = locationsViewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }
}