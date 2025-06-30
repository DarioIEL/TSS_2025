class User{
    constructor(username, password, todoList){
        this.username = username;
        this.password = password;
        this.todoList = todoList;
    }
}

//1. controllo il form
//2. uso i campi per valorizzare l'utente
//3. salvo in LS
let demo = document.querySelector("#demo");
let mioForm = document.querySelector("#mioForm");

let userConnesso = new User();

function controllaForm(event){

    if(mioForm.username.value == ""){
        event.preventDefault();
        demo.innerHTML += "mi spiace, non hai inserito il nome";
    }else{
        userConnesso.username = mioForm.username.value;
    }

    if(mioForm.password.value == ""){
        event.preventDefault();
        demo.innerHTML += "mi spiace, non hai inserito la password";
    }else{
        userConnesso.password = mioForm.password.value;
    }

    //registro stesso qui dentro il mio user
    if(userConnesso.username != "" && userConnesso.password != ""){
        userConnesso.todoList = [];
        let userJSON = JSON.stringify(userConnesso);
        localStorage.setItem("userConnesso", userJSON);
        
    }
}

mioForm.addEventListener("submit", controllaForm);

