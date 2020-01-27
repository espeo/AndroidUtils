package eu.espeo.androidutils.extensions

import androidx.viewpager.widget.ViewPager

/**
 * Created by Maciej Kozłowski on 2020-01-20.
 */

private typealias PageSelectedListener = (Int) -> Unit

fun ViewPager.addPageSelectedListener(onPageSelected: PageSelectedListener) {
    this.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
        override fun onPageScrollStateChanged(state: Int) {
            // Nothing to do
        }

        override fun onPageScrolled(
            position: Int,
            positionOffset: Float,
            positionOffsetPixels: Int
        ) {
            // Nothing to do
        }

        override fun onPageSelected(position: Int) {
            onPageSelected(position)
        }
    })
}