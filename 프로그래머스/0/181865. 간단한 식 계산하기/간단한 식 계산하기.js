function solution(binomial) {
    var answer = 0;
    var values = binomial.split(' ');
    
    switch(values[1]) {
        case '+': return Number(values[0]) + Number(values[2]);
        case '-': return Number(values[0]) - Number(values[2]);
        case '*': return Number(values[0]) * Number(values[2]);
        case '/': return Number(values[0]) / Number(values[2]);
    }
    
    return answer;
}