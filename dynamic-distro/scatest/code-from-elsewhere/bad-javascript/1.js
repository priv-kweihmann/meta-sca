
(function x(){"use strict"; x = 1;}()); // TypeError
(function x(){x = 1; return x !== 1;}()); // write fails silently; function returns true

(function x(){"use strict"; x = (function(){throw 0;})();})() // Error 0

// These three lines rely on ES6. 
(function x(){const x = 1;})() // No-op. In particular, not a redeclaration of x.
(function (){"use strict"; const x = 1; x = 2;})() // TypeError
(function (){const x = 1; x = 2;})() // TypeError. contrast (function x(){x = 2;}());

//*******************

// Prints 'a b c d e f g h i j k'. Note lack of additional 'c d' before 'k'. No one gets this right.

if (typeof console === 'undefined') console = {log: print};

function one(){
  console.log('a');
  return {
    get p() {
      console.log('e');
      return {
        valueOf: function(){
          console.log('g');
          return {};
        },
        toString: function(){
          console.log('h');
          return false;
        }
      };
    },
    set p(x) {
      console.log('k');
    }
  };
}

function two(){
  console.log('b');
  return {
    toString: function(){
      console.log('c');
      return {};
    },
    valueOf: function(){
      console.log('d');
      return 'p';
    }
  };
}

function three() {
  console.log('f');
  return {
    valueOf: function(){
      console.log('i');
      return {};
    },
    toString: function(){
      console.log('j');
      return false;
    }
  };
}

one()[two()] += three();




// Prints 'a b c d e g h k', in that order. Firefox gets this right, no one else does.

console.log('--');

one()[two()]++



// Prints 'a b', in that order. JavaScriptCore is the only engine to get this wrong, to my knowledge.

console.log('--');

function four() {
  console.log('a');
  return null;
}

try {
  four()[two()] += three();
} catch(e) {
  // pass
}

//*******************


(function(x, y){ y = 1; return arguments[1]; })(0) // undefined
(function(x, y){ arguments[1] = 1; return y; })(0) // undefined


//*******************


var f = function(m){
  x: try {
    return 2;
  } finally {
    try {
      
    } finally {
      switch(m) {
        case 0: return 0;
        case 1: break x;
        case 2: "nop";
      }
    }
  }
  return 1;
}

console.log(f(0) == 0);
console.log(f(1) == 1);
console.log(f(2) == 2);


//*******************


// no-op
x: try {
  throw 0;
} catch(e) {
  try {
    throw 1;
  } catch(e2) {
    throw e2;
  }
} finally {
  break x;
}


//*******************


(function (x) {
  console.log(Object.getOwnPropertyDescriptor(arguments, '0'));
  arguments[0] = 1;
  
  console.log(Object.getOwnPropertyDescriptor(arguments, '0'));
  
  x = 2;
  console.log(Object.getOwnPropertyDescriptor(arguments, '0'));
  
  Object.defineProperty(arguments, '0', {value: 3, writable: true, configurable: true, enumerable: true});
  console.log(Object.getOwnPropertyDescriptor(arguments, '0'));
  console.log(x); // 3 (in chrome; 2 in firefox)
  
  Object.defineProperty(arguments, '0', {get: function(){return 4;}, configurable: true, enumerable: true});
  
  console.log(x); // 3 (in chrome; 2 in firefox; never 4)
  
  Object.defineProperty(arguments, '0', {value: 5, writable: true, configurable: true, enumerable: true});
  
  console.log(x); // 3 (in chrome; 2 in firefox; never 4)
  
  console.log(Object.getOwnPropertyDescriptor(arguments, '0'));
})(0)


//*******************


Object.defineProperty((function(){return this;})(), 'y', {set: function(x){console.log('why')}})
Object.defineProperty((function(){return this;})(), 'z', {get: function(){console.log('bad')}})
y = 1; // prints 'why'
z; // prints 'bad'. yes, this is a bare variable access with side effects.


//*******************


try {
  throw null;
} catch(e) {
  var e = 2;
}
e; // undefined, but not reference error


with({z:1}){
  var z = 0;
}
z; // undefined, but not reference error


//*******************


typeof document.all === 'undefined'; // true
document.all[0]; // not an error


//*******************


function isAProxy(arg) {
  let child = {};
  Object.setPrototypeOf(child, arg);

  let parent = {};
  Object.setPrototypeOf(arg, parent);

  try {
    Object.setPrototypeOf(parent, child); // see 9.1.2.1.8.c.i
    return true;
  } catch({}) {
    return false;
  }
}

isAProxy(new Proxy({}, {})); // true
isAProxy({}); // false


//*******************


// This is a sequence of two IdentifierExpressions. Keywords are sequences of literal codepoints, so it's not the 'let' keyword. But in sloppy mode, nothing restricts an identifier from being named "let".
le\u0074
a;


//*******************

// Scripts support HTML comments, so both of these are just comments:

--> foo

<!-- bar

// On the other hand, modules don't. So the below has very different parse trees in scripts vs modules.

a<!--b




//*******************

let x;
(class A { [x = () => A](){} });
x(); // the class!

(class B { [A](){} }); // TDZ error!

