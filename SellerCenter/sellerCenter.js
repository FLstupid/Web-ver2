document.addEventListener("DOMContentLoaded",function() {
    let navList = document.getElementsByClassName("nav");
    let contentList = document.getElementsByClassName("main-content");
    for (let i=0; i<navList.length;i++) {
        navList[i].addEventListener("click",function() {
            for (let j = 0; j < navList.length ; j++) {
                contentList[j].classList.remove("show");
                contentList[j].classList.add("hide");
                navList[j].classList.remove("is-active");
            }
            navList[i].classList.add("is-active");
            contentList[i].classList.add("show");
            contentList[i].classList.remove("hide");
        })
    }
})