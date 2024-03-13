import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class LocationWeatherPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    private val fragmentList: MutableList<Fragment> = ArrayList()

    override fun getItemCount(): Int = fragmentList.size

    override fun createFragment(position: Int): Fragment = fragmentList[position]

    fun addFragment(fragment: Fragment) {
        Log.e("xd", "add weather fragment")
        val index = fragmentList.size - 1
        fragmentList.add(index, fragment)
        notifyItemInserted(index)
//        notifyItemChanged(index + 1)
    }

    fun addAddLocationFragment(fragment: Fragment) {
        Log.e("xd", "add location fragment")
        val index = fragmentList.size
        fragmentList.add(index, fragment)
        notifyItemInserted(index)
    }

    fun getFragments(): List<Fragment> = fragmentList
}