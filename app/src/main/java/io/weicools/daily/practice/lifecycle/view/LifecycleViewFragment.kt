package io.weicools.daily.practice.lifecycle.view

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * @author weicools
 * @date 2020.08.18
 */
class LifecycleViewFragment : Fragment() {
  val TAG = "LifecycleViewFragment"

  override fun onAttach(context: Context) {
    super.onAttach(context)
    Log.d(TAG, "onAttach: ")
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    Log.d(TAG, "onCreate: ")
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    Log.d(TAG, "onActivityCreated: ")
  }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    Log.d(TAG, "onCreateView: ")
    return LifecycleView3(context!!)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    Log.d(TAG, "onViewCreated: ")
  }

  override fun onStart() {
    super.onStart()
    Log.d(TAG, "onStart: ")
  }

  override fun onResume() {
    super.onResume()
    Log.d(TAG, "onResume: ")
  }

  override fun onPause() {
    super.onPause()
    Log.d(TAG, "onPause: ")
  }

  override fun onStop() {
    super.onStop()
    Log.d(TAG, "onStop: ")
  }

  override fun onDestroyView() {
    super.onDestroyView()
    Log.d(TAG, "onDestroyView: ")
  }

  override fun onDestroy() {
    super.onDestroy()
    Log.d(TAG, "onDestroy: ")
  }

  override fun onDetach() {
    super.onDetach()
    Log.d(TAG, "onDetach: ")
  }

  override fun onAttachFragment(childFragment: Fragment) {
    super.onAttachFragment(childFragment)
    Log.d(TAG, "onAttachFragment: ")
  }
}