const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const container = document.getElementById('container');
const button = document.getElementsByClassName('.btn1');
console.log(button);
signUpButton.addEventListener('click', () => {
	container.classList.add("right-panel-active");
});

signInButton.addEventListener('click', () => {
	container.classList.remove("right-panel-active");
});