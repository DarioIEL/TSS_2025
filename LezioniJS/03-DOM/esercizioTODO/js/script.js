let btnAdd = document.querySelector("#btnAdd");
let listaTodo = document.querySelector("#listaTodo");
let item = document.querySelector("#item"); //<input>
let feed = document.querySelector("#feed");

let usernameConnesso = document.querySelector("#usernameConnesso");


let userConnesso;

function prendiUserConnesso(){
    let userConnessoJSON = localStorage.getItem("userConnesso"); //Questo è un JSON
    if(userConnessoJSON == null){
        usernameConnesso.innerHTML = "Mi spiace non c'è nessun utente connesso";
    }else{

        userConnesso = JSON.parse(userConnessoJSON); //Questo è l'oggetto
        usernameConnesso.innerHTML = userConnesso.username;
        stampaToDoUserConnesso(userConnesso);
    }
}

/**
 * @param {Object} user 
 */
function stampaToDoUserConnesso(user){
    user.todoList.forEach(item => {
        let li = document.createElement("li");
        li.textContent = item;
         li.addEventListener("click", function(event){
            this.classList.toggle("txtBar");
        });

        let button = document.createElement("button");
        button.textContent = "X";
    button.addEventListener("click", function(){
        //this è button
        //parentNode è li
        console.log(this.parentNode);
        listaTodo.removeChild(this.parentNode);
        rimuoviItemDaLS(item);
    });
    li.appendChild(button); //il button è figlio di li
    listaTodo.appendChild(li); 
    });
}

/**
 * @param {String} item 
 */
function rimuoviItemDaLS(item){
    let indiceItem = userConnesso.todoList.indexOf(item);
    userConnesso.todoList.splice(indiceItem, 1);
    console.log(userConnesso);
    localStorage.setItem("userConnesso", JSON.stringify(userConnesso))
}


function addTodo(){    
    feed.innerHTML = "";
    
    let todoItem = item.value; //valore del campo
    // console.log(todoItem);
    
    if(todoItem != "" && todoItem.trim() != ""){
        
        let li = document.createElement("li");
        li.textContent = todoItem;
        
        
        li.addEventListener("click", function(event){
            // console.log(li.textContent);
            // console.log(this); //this fa riferimento a li sul quale monto addEventList..
            // console.log(this.firstChild.nodeValue); 
            // console.log(event.target);
            
            // this.setAttribute("class", "txtBar");
            this.classList.toggle("txtBar");
        });
        
        
        let button = document.createElement("button");
        button.textContent = "X";
    button.addEventListener("click", function(){
        //this è button
        //parentNode è li
        console.log(this.parentNode);
        listaTodo.removeChild(this.parentNode);
        rimuoviItemDaLS(todoItem);
    })
    
    li.appendChild(button); //il button è figlio di li
    listaTodo.appendChild(li); 
    
    //pulisco il campo input
    item.value = "";

    userConnesso.todoList.push(todoItem);
    localStorage.setItem("userConnesso", JSON.stringify(userConnesso));
    console.log(userConnesso);

}else{
    feed.innerHTML = "<h5>Mi spiace, non hai scritto nulla</h5>"
}
}

btnAdd.addEventListener("click", addTodo);

item.addEventListener("keypress", function(event){
   // console.log(event);
   if(event.key == "Enter"){
       // addTodo();
       btnAdd.click(); //richiamo l'evento click sul pulsante. Questo evento fa addTodo
    }  
})

document.addEventListener("DOMContentLoaded", prendiUserConnesso);