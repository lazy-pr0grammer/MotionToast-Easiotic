# MotionToast-Easiotic

Java version of MotionToast 🔥

This is the first java version of MotionToast by Lazy-pr0grammer 

Don't forget to check Spikeysanju's library also 

@Spikeysanju

https://github.com/Spikeysanju/MotionToast

[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com) [![GitHub license](https://img.shields.io/badge/License-Apache2.0-blue.svg)](LICENSE) ![GitHub stars](https://img.shields.io/github/stars/lazy-pr0grammer/MotionToast-Easiotic?style=social) ![GitHub forks](https://img.shields.io/github/forks/lazy-pr0grammer/MotionToast-Easiotic?label=Fork&style=social) ![Repo size](https://img.shields.io/github/repo-size/lazy-pr0grammer/MotionToast-Easiotic?style=social) ![GitHub follow](https://img.shields.io/github/followers/lazy-pr0grammer?label=Follow&style=social)

A beautiful Toast library in Android Java ♨️

![GitHub Cards Preview](https://github.com/lazy-pr0grammer/MotionToast-Easiotic/blob/master/screenshots/banner.png)

# Types of toast style 😋

  Light MotionToasts: 
  
  ![alt text](https://github.com/lazy-pr0grammer/MotionToast-Easiotic/blob/master/screenshots/Light.png)

  

  Dark MotionToasts: 
  
  ![alt text](https://github.com/lazy-pr0grammer/MotionToast-Easiotic/blob/master/screenshots/Dark.png)


## What's New 👻

1. Added round corner support for Light full color toasts.

2. Made it more easy for everyone. 

3. Removed old fonts and added new fonts.

4. Now the library is more easy-to-use

## How to use? 🤔

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```

	allprojects {

		repositories {

			...

			maven { 
                           url 'https://jitpack.io' 
                     }

		}

	}

```

Add dependency in your app module

```

	dependencies {

	        implementation 'com.github.lazy-pr0grammer:MotionToast-Easiotic:1.0' 

	}

```

## Five types of Toast 🖐🏻

```

1. MotionStyle.SUCCESS

2. MotionStyle.WARNING

3. MotionStyle.ERROR

4. MotionStyle.INFO

5. MotionStyle.DELETE

```

## Toast duration ⏳

```

1. MotionStyle.LENGTH_SHORT //3 seconds

2. MotionStyle.LENGTH_LONG //4 seconds

```

## Toast modes 🐸

```

1. MotionStyle.LIGHT

2. MotionStyle.DARK

```

## Toast gravity 🚀

```

1. MotionStyle.TOP

2. MotionStyle.CENTER

3. MotionStyle.BOTTOM

```

## Color mode 🌈

```

1. 0 //Zero is for full color Toast

2. 1 //One is for transparent color Toast

```

## Sample codes for MotionToasts ❄

### Full color Success MotionToast(Light)

```

MotionToast motionToast = 

new MotionToast(MainActivity.this,

0,

MotionStyle.LIGHT,

MotionStyle.SUCCESS,

MotionStyle.BOTTOM,

"SUCCESS",

"You got a reward :)",

MotionStyle.LENGTH_SHORT)

.show();

```

### Transparent color Success MotionToast(Dark)

```

MotionToast motionToast = 

new MotionToast(MainActivity.this,

1,

MotionStyle.LIGHT,

MotionStyle.SUCCESS,

MotionStyle.BOTTOM,

"SUCCESS",

"You got a reward :)",

MotionStyle.LENGTH_SHORT)

.show();

```

### Full color Success MotionToast(Dark)

```

MotionToast motionToast = 

new MotionToast(MainActivity.this,

0,

MotionStyle.DARK,

MotionStyle.SUCCESS,

MotionStyle.BOTTOM,

"SUCCESS",

"You got a reward :)",

MotionStyle.LENGTH_SHORT)

.show();

```

### Transparent color Success MotionToast(Dark)

```

MotionToast motionToast = 

new MotionToast(MainActivity.this,

1,

MotionStyle.DARK,

MotionStyle.SUCCESS,

MotionStyle.BOTTOM,

"SUCCESS",

"You got a reward :)",

MotionStyle.LENGTH_SHORT)

.show();

```

Thank you :)
