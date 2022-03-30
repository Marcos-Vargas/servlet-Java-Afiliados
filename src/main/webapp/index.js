alert("Esto que")
// Validacion de entradas de inputs
document.getElementById('firstNames').addEventListener('keypress',(e)=>{
if(parseInt(e.keyCode)>48 && parseInt(e.keyCode)<58){
    e.preventDefault();
}
})
document.getElementById('lastNames').addEventListener('keypress',(e)=>{
    if(parseInt(e.keyCode)>48 && parseInt(e.keyCode)<58){
        e.preventDefault();
    }else{ 
    }
    })
document.getElementById('numDoc').addEventListener('keypress',(e)=>{
    if(parseInt(e.keyCode)>47 && parseInt(e.keyCode)<58){  
    }else{
        e.preventDefault();
    }
    })
document.getElementById('phone').addEventListener('keypress',(e)=>{
    if(parseInt(e.keyCode)>47 && parseInt(e.keyCode)<58){
    }else{
        e.preventDefault();
    }
    })
document.getElementById('idAffiliate').addEventListener('keypress',(e)=>{
    if(parseInt(e.keyCode)>47 && parseInt(e.keyCode)<58){
    }else{
        e.preventDefault();
    }
    })
document.getElementById('cod-event').addEventListener('keypress',(e)=>{
    if(parseInt(e.keyCode)>47 && parseInt(e.keyCode)<58){
    }else{
        e.preventDefault();
    }
    })

// Todos los eventos relacionados a los botones

document.getElementById('btn-add-affiliate').addEventListener('click',()=>{

    const xhr = new XMLHttpRequest();
    xhr.open('post','AddAffiliates',true)
    xhr.onreadystatechange = ()=>{
        if( xhr.readyState === 4 && xhr.status === 200 ){
            alert(xhr.responseText)
        }
    }
    const data = ``;
    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhr.send( data )

})

document.getElementById('btn-delete-affiliate').addEventListener('click',()=>{
    const xhr = new XMLHttpRequest();
    xhr.open('post','DeleteAffiliates',true)
    xhr.onreadystatechange = ()=>{
        if( xhr.readyState === 4 && xhr.status === 200 ){
            alert(xhr.responseText)
        }
    }
    const data = ``;
    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhr.send( data )
    
})
document.getElementById('btn-update-affiliate').addEventListener('click',()=>{
    const xhr = new XMLHttpRequest();
    xhr.open('post','UpdateAffiliates',true)
    xhr.onreadystatechange = ()=>{
        if( xhr.readyState === 4 && xhr.status === 200 ){
            alert(xhr.responseText)
        }
    }
    const data = ``;
    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhr.send( data )
    
})
document.getElementById('btn-register-team').addEventListener('click',()=>{
    const xhr = new XMLHttpRequest();
    xhr.open('post','AddTeams',true)
    xhr.onreadystatechange = ()=>{
        if( xhr.readyState === 4 && xhr.status === 200 ){
            alert(xhr.responseText)
        }
    }
    const data = ``;
    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhr.send( data )
    
})
document.getElementById('btn-delete-team').addEventListener('click',()=>{
    const xhr = new XMLHttpRequest();
    xhr.open('post','DeleteTeams',true)
    xhr.onreadystatechange = ()=>{
        if( xhr.readyState === 4 && xhr.status === 200 ){
            alert(xhr.responseText)
        }
    }
    const data = ``;
    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhr.send( data )
    
})
document.getElementById('btn-enroll-affiliate-team').addEventListener('click',()=>{
    const xhr = new XMLHttpRequest();
    xhr.open('post','AddAffiliatesToTeam',true)
    xhr.onreadystatechange = ()=>{
        if( xhr.readyState === 4 && xhr.status === 200 ){
            alert(xhr.responseText)
        }
    }
    const data = ``;
    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhr.send( data )
    
})
document.getElementById('btn-delete-affiliate-team').addEventListener('click',()=>{
    const xhr = new XMLHttpRequest();
    xhr.open('post','DeleteAffiliatesToTeam',true)
    xhr.onreadystatechange = ()=>{
        if( xhr.readyState === 4 && xhr.status === 200 ){
            alert(xhr.responseText)
        }
    }
    const data = ``;
    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhr.send( data )
    
})
document.getElementById('btn-addEvent').addEventListener('click',()=>{
    const xhr = new XMLHttpRequest();
    xhr.open('post','AddEvents',true)
    xhr.onreadystatechange = ()=>{
        if( xhr.readyState === 4 && xhr.status === 200 ){
            alert(xhr.responseText)
        }
    }
    const data = ``;
    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhr.send( data )
    
})
document.getElementById('btn-deleteEvent').addEventListener('click',()=>{
    const xhr = new XMLHttpRequest();
    xhr.open('post','DeleteEvents',true)
    xhr.onreadystatechange = ()=>{
        if( xhr.readyState === 4 && xhr.status === 200 ){
            alert(xhr.responseText)
        }
    }
    const data = ``;
    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhr.send( data )
    
})
document.getElementById('btn-add-team-person').addEventListener('click',()=>{
    const xhr = new XMLHttpRequest();
    xhr.open('post','AddIntegrantsToEvents',true)
    xhr.onreadystatechange = ()=>{
        if( xhr.readyState === 4 && xhr.status === 200 ){
            alert(xhr.responseText)
        }
    }
    const data = ``;
    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhr.send( data )
    
})

document.getElementById('btn-delete-team-person').addEventListener('click',()=>{
    const xhr = new XMLHttpRequest();
    xhr.open('post','DeleteParticipantsOfEvent',true)
    xhr.onreadystatechange = ()=>{
        if( xhr.readyState === 4 && xhr.status === 200 ){
            alert(xhr.responseText)
        }
    }
    const data = ``;
    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhr.send( data )
    
})

document.getElementById('btn-assign-results').addEventListener('click',()=>{
    const xhr = new XMLHttpRequest();
    xhr.open('post','AsignResultsEvents',true)
    xhr.onreadystatechange = ()=>{
        if( xhr.readyState === 4 && xhr.status === 200 ){
            alert(xhr.responseText)
        }
    }
    const data = ``;
    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhr.send( data )
    
})


