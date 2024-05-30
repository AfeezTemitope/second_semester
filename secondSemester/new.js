const bigbby =()=>{
    
    const firstFunction = () => {
    console.log('first function')
    }

    const secondFunction = (badAfeez)=>{
    console.log('second function')
    badAfeez()
    }
    secondFunction(firstFunction)
}
bigbby()