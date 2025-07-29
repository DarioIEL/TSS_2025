import { useEffect, useState } from "react";

function TestFetching(){
    
    // const [users, setUsers] = useState([]);
    const [data, setData] = useState([]);
    
    // const destinations = [
    //     {name: "users", label: "Utenti"},
    //     {name: "msgs", label: "Messages"}
    // ]

    const fetchData = async(destination) => {
        const response = await fetch(`http://localhost:3000/${destination}`);
        const results = await response.json();

        setData(results);
    }

    // const fetchUsers = async () =>{        
    //     const response = await fetch("http://localhost:3000/users");
    //     const data = await response.json();
    //     setUsers(data);
    // }
    
    // // Con useEffect chiamo la fetch al momento in cui viene rederizzato il component
    // useEffect(()=>{
    //     fetchUsers();
    // }, []) //l'array vuoto mi permette di eseguirlo al momento del mount

    useEffect(()=>{
        fetchData('msgs'); //al primo caricamento mi carica gli users
    }, [])


    return(
        <>
            {/* {users.map((user)=>(
                <div className="card" key={user.id}>
                    <p>{user.nome}</p>
                    <p>{user.cognome}</p>
                </div>
            ))} */}

                {data.map((data)=>(
                    <div className="card"
                        key={data.id}>
                        <p>{data.txt}</p>
                        {/* <p>{data.cognome}</p> */}
                    </div>
                ))}
        </>
    )
}

export default TestFetching;