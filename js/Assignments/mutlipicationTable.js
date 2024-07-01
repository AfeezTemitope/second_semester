for(let i = 1; i <= 12; i++) {
    let line = '';
    for(let j = 1; j <= 12; j++) {
        line += `${j} * ${i} = ${i * j}\t`;
    }
    console.log(line);
}
