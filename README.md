# BootCamp_HW3
![GfpTAY_59a260301115c9ec72c35be7ca574618_00-00-00_00-00-35_2](https://user-images.githubusercontent.com/48966180/174899791-2dcc634e-0354-4483-915b-91892fe22a41.gif)

### Every listener has the same line of codes except the button's values. Example of listener functionality.
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
        
---

### Explanation of first if statement
            if (plusClicked == true || equClicked == true){
                binding.textView.text = "0"
                plusClicked = false
                equClicked = false
            }
#### If the user clicked the plus or equal sign that means the next num will clear TextView until the user clicked another numButton. From the following codes below, you can see plusClicked and equClicked variables are changing their value when the user clicks either of them. Since every function has this if statement, for working successfully after changing TextView both boolean values are set to false.

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

---
### Explanation of second if statement
#### When the user clicks the first time of any number button, to avoid "0" -> "07" statement checks the length of the string. If the user clicked any number button more than 7 times a Snackbar widget pops up to warn the user that can not give more input. In this wise, it avoid oversize the screen 
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
