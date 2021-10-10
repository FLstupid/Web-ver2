document.addEventListener("DOMContentLoaded",function (){
    var disableForm = document.querySelectorAll(".formshow");
    var showForm = document.querySelectorAll(".formresult");
    for(let i=0;i<disableForm.length;i++)
    {       let t=i;
        disableForm[i].addEventListener("click",function (){

            for(let i=0;i<disableForm.length;i++)
            {
                disableForm[i].classList.remove('is-active');
                showForm[i].classList.add('disableForm');
            }
            this.classList.add('is-active');
            showForm[t].classList.remove('disableForm');
        })
    }
})
