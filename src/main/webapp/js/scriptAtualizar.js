const form = document.getElementById("form");
const email = document.getElementById("Email");

form.addEventListener("submit", (e) => {
  e.preventDefault();

  checkInputs();
});

function checkInputs() {

  const emailValue = email.value;

  if (emailValue === "") {
    alert("insira um email")
  } else if (!checkEmail(emailValue)) {
   alert( "Por favor, insira um email válido.");
  }
}




function checkEmail(email) {
  return /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(
    email
  );
}