Person obj = new Person(name, age);

function createIncrement() {
  let count = 0;
  function increment() {
    count++;
  }
  let message = `Count is ${count}`;
  function log() {
    console.log(message);
  }

  return [increment, log];
}

var obj = createIncrement();
obj[0]();
obj[1]();


function printSum(num1, num2) {
    let sum = 0;
    if(isNaN(num1)) {
        console.log("print valid numbers");
    } else {
        if(isNaN(num2)) {
            console.log("print valid numbers");
        } else {
            sum = num1 + num2;
        }
    }
   return sum;
}

function test() {
let arr = [1, 2, 3, 10, 5, 6, 1, 2];
//1,2,3,10,5,6
//3,10,5,6

function removeDuplicates(arr) {
    var output1 = arr.filter((item, index) => arr.indexOf(item));
    console.log(output);

    //fetch
    var output2 = arr.filter(item, i, a) => a.indexOf(item) == i)
    console.log(output2);
}
}


