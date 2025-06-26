let btnAdd = document.querySelector("#btnAdd");
let listaTodo = document.querySelector("#listaTodo");
let item = document.querySelector("#item"); //<input>
let feed = document.querySelector("#feed");


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
    })
    
    li.appendChild(button); //il button è figlio di li
    listaTodo.appendChild(li); 
    
    //pulisco il campo input
    item.value = "";
    }else{
        feed.innerHTML = "<h5>Mi spiace, non hai scritto nulla</h5>"
    }
}

btnAdd.addEventListener("click", addTodo);

item.addEventListener("keypress", function(event){
    console.log(event);
    if(event.key == "Enter"){
        // addTodo();
        btnAdd.click(); //richiamo l'evento click sul pulsante. Questo evento fa addTodo
    }  
})