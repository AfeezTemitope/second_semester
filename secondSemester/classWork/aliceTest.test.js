const {anyName} = require ("./aliceTest");

test('the task is tough', ()=>{
    studentScores  = [95,78,85,60,45,92]
    expectedResult = ['A','C','B','D','F','A']
    expect(anyName(studentScores)).toEqual(expectedResult)
})