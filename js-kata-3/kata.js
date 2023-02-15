const RESULT_DISPLAYELEMENT = document.getElementById("kata-result");
const CHARACTER_INPUT = document.getElementById("kata-character-input");
const TEST_CONTAINER = document.getElementById("kata-test-container");
const RUN_TEST_BUTTON = document.getElementById("kata-run-test");


function findSecondLargestNumber(numArray){
   if(!numArray || !numArray.isArray) throw "invalid input";
   if(numArray.length === 1) return numArray[0];
   if(numArray.length === 0 || (numArray.length === 2 && numArray[0] === numArray[1]))return 0;
   return numArray.sort((a,b)=>b-a).filter((elem,index,array)=>array.indexOf(elem)===index)[1];
}

function runCalc(){
   let result = findSecondLargestNumber(formatArray(CHARACTER_INPUT.value));
   RESULT_DISPLAYELEMENT.innerText = result;
}
document.getElementById("kata-submit").addEventListener("click",runCalc);

function runSingleTest(input){
   buildConsoleOutput("Running calc on array: "+input);
   try{

      buildConsoleOutput("Result: "+ findSecondLargestNumber(input));
   }catch(error){
      buildConsoleOutput(error);
   } finally {
      buildConsoleOutput("--------------------");
   }
}

function runCalcTest(){
   runSingleTest([10,40,30,20,50]);
   runSingleTest([25,143,89,13,105]);
   runSingleTest([54, 23, 11, 17, 10]);
   runSingleTest([1,1]);
   runSingleTest([1]);
   runSingleTest([]);
}


function buildConsoleOutput(content){
   let newConsoleOutput = document.createElement("p");
   newConsoleOutput.innerText = content;
   newConsoleOutput.className = "console-output";
   TEST_CONTAINER.insertBefore(newConsoleOutput,document.getElementById("anchor"));

}

function formatArray(inputArray){
   return inputArray.replaceAll(" ","").split(",").map((value)=>parseInt(value));
}

RUN_TEST_BUTTON.addEventListener("click",runCalcTest);