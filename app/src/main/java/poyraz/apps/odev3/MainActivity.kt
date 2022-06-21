package poyraz.apps.odev3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import poyraz.apps.odev3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var firstNum = 0
        var secondNum = 0
        var plusClicked = false
        var equClicked = false

        binding.textView.text = "0"

        binding.buttonC.setOnClickListener{
            binding.textView.text = "0"
        }

        binding.buttonSeven.setOnClickListener{
            if (plusClicked == true || equClicked == true){
                binding.textView.text = "0"
                plusClicked = false
                equClicked = false
            }
            var num:String = binding.textView.text as String
            if (num[0] == '0'){
                num="7"
            }else {
                if (num.length <= 7) {
                    num += '7'
                }
                else{
                    Snackbar.make(binding.root,"You can not add more number",Snackbar.LENGTH_SHORT).show()
                }
            }
            binding.textView.text = num

        }

        binding.buttonEight.setOnClickListener{
            if (plusClicked == true || equClicked == true){
                binding.textView.text = "0"
                plusClicked = false
                equClicked = false
            }
            var num:String = binding.textView.text as String
            if (num[0] == '0'){
                num="8"
            }else {
                if (num.length <= 7) {
                    num += '8'
                }
                else{
                    Snackbar.make(binding.root,"You can not add more number",Snackbar.LENGTH_SHORT).show()
                }
            }
            binding.textView.text = num

        }

        binding.buttonNine.setOnClickListener{
            if (plusClicked == true || equClicked == true){
                binding.textView.text = "0"
                plusClicked = false
                equClicked = false
            }
            var num:String = binding.textView.text as String
            if (num[0] == '0'){
                num="9"
            }else {
                if (num.length <= 7) {
                    num += '9'
                }
                else{
                    Snackbar.make(binding.root,"You can not add more number",Snackbar.LENGTH_SHORT).show()
                }
            }
            binding.textView.text = num

        }

        binding.buttonFour.setOnClickListener{
            if (plusClicked == true || equClicked == true){
                binding.textView.text = "0"
                plusClicked = false
                equClicked = false
            }
            var num:String = binding.textView.text as String
            if (num[0] == '0'){
                num="4"
            }else {
                if (num.length <= 7) {
                    num += '4'
                }
                else{
                    Snackbar.make(binding.root,"You can not add more number",Snackbar.LENGTH_SHORT).show()
                }
            }
            binding.textView.text = num

        }

        binding.buttonFive.setOnClickListener{
            if (plusClicked == true || equClicked == true){
                binding.textView.text = "0"
                plusClicked = false
                equClicked = false
            }
            var num:String = binding.textView.text as String
            if (num[0] == '0'){
                num="5"
            }else {
                if (num.length <= 7) {
                    num += '5'
                }
                else{
                    Snackbar.make(binding.root,"You can not add more number",Snackbar.LENGTH_SHORT).show()
                }
            }
            binding.textView.text = num

        }

        binding.buttonSix.setOnClickListener{
            if (plusClicked == true || equClicked == true){
                binding.textView.text = "0"
                plusClicked = false
                equClicked = false
            }
            var num:String = binding.textView.text as String
            if (num[0] == '0'){
                num="6"
            }else {
                if (num.length <= 7) {
                    num += '6'
                }
                else{
                    Snackbar.make(binding.root,"You can not add more number",Snackbar.LENGTH_SHORT).show()
                }
            }
            binding.textView.text = num

        }

        binding.buttonOne.setOnClickListener{
            if (plusClicked == true || equClicked == true){
                binding.textView.text = "0"
                plusClicked = false
                equClicked = false
            }
            var num:String = binding.textView.text as String
            if (num[0] == '0'){
                num="1"
            }else {
                if (num.length <= 7) {
                    num += '1'
                }
                else{
                    Snackbar.make(binding.root,"You can not add more number",Snackbar.LENGTH_SHORT).show()
                }
            }
            binding.textView.text = num

        }

        binding.buttonTwo.setOnClickListener{
            if (plusClicked == true || equClicked == true){
                binding.textView.text = "0"
                plusClicked = false
                equClicked = false
            }
            var num:String = binding.textView.text as String
            if (num[0] == '0'){
                num="2"
            }else {
                if (num.length <= 7) {
                    num += '2'
                }
                else{
                    Snackbar.make(binding.root,"You can not add more number",Snackbar.LENGTH_SHORT).show()
                }
            }
            binding.textView.text = num

        }
        binding.buttonThree.setOnClickListener{
            if (plusClicked == true || equClicked == true){
                binding.textView.text = "0"
                plusClicked = false
                equClicked = false
            }
            var num:String = binding.textView.text as String
            if (num[0] == '0'){
                num="3"
            }else {
                if (num.length <= 7) {
                    num += '3'
                }
                else{
                    Snackbar.make(binding.root,"You can not add more number",Snackbar.LENGTH_SHORT).show()
                }
            }
            binding.textView.text = num

        }
        binding.buttonZero.setOnClickListener{
            if (plusClicked == true || equClicked == true){
                binding.textView.text = "0"
                plusClicked = false
                equClicked = false
            }
            var num:String = binding.textView.text as String
            if (num[0] == '0'){
                num="0"
            }else {
                if (num.length <= 7) {
                    num += '0'
                }
                else{
                    Snackbar.make(binding.root,"You can not add more number",Snackbar.LENGTH_SHORT).show()
                }
            }
            binding.textView.text = num

        }
        binding.buttonPlus.setOnClickListener{
            var temp:String = binding.textView.text as String
            firstNum = temp.toInt()
            plusClicked = true
            equClicked = false
        }

        binding.buttonEqu.setOnClickListener{
            equClicked = true
            var temp:String = binding.textView.text as String
            secondNum = temp.toInt()
            binding.textView.text = (firstNum+secondNum).toString()
            firstNum = 0
            secondNum = 0
        }

    }
}