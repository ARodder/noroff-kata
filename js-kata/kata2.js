const RESULT_DISPLAYELEMENT = document.getElementById("kata-2-result");
const CHARACTER_INPUT = document.getElementById("kata-2-character-input");
const TEXT_INPUT = document.getElementById("kata-2-text-input");
const TEST_CONTAINER = document.getElementById("kata-2-test-container");
const RUN_TEST_BUTTON = document.getElementById("kata-2-run-test");


function charCount(char, text){

   if(!char || char.length !== 1 || !text) throw "Invalid input";
   let charAmnt = 0;
   text.split("").forEach((elem)=>elem === char ?charAmnt++:null);
   return charAmnt;
}

function runCalc(){
   let result = charCount(CHARACTER_INPUT.value,TEXT_INPUT.value);
   RESULT_DISPLAYELEMENT.innerText = result;
}
document.getElementById("kata-2-submit").addEventListener("click",runCalc);

function runSingleTest(char,text){
   buildConsoleOutput("Running calc on letter: "+char+" in text: "+text+"...");
   try{

      buildConsoleOutput("Result: "+ charCount(char,text));
   }catch(error){
      buildConsoleOutput(error);
   }
   setTimeout(()=>console.log("Simulate calc time"),1000);
}

function runCalcTest(){
   runSingleTest("a","edabit");
   runSingleTest("c","Chamber of secrets");
   runSingleTest("B","boxes are fun");
   runSingleTest("b","big fat bubble");
   runSingleTest("e","javascript is good");
   runSingleTest("!","!easy!");
   runSingleTest("wow","the universe is wow");
}


function buildConsoleOutput(content){
   let newConsoleOutput = document.createElement("p");
   newConsoleOutput.innerText = content;
   newConsoleOutput.className = "console-output";
   TEST_CONTAINER.insertBefore(newConsoleOutput,document.getElementById("anchor"));

}

RUN_TEST_BUTTON.addEventListener("click",runCalcTest);