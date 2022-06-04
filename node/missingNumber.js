let arr =[21,25,22,26,24,27,30,23,28] 
const findMissing = num => {
    const max = Math.max(...num); 
    const min = Math.min(...num); 
    const missing = []
  
    for(let i=min; i<= max; i++) {
      if(!num.includes(i)) { 
        missing.push(i); 
      }
    }
    return missing;
  }
  

  console.log(findMissing(arr).join())