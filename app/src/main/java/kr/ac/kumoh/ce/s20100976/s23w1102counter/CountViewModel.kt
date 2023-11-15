package kr.ac.kumoh.ce.s20100976.s23w1102counter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    private val _count = MutableLiveData(0)
    var count: LiveData<Int> = _count

    fun onAdd(){
        _count.value = _count.value?.plus(1)
    }
    fun onSub(){
        if((_count.value ?:0 )> 0)
            _count.value = _count.value?.minus(1)
    }
}