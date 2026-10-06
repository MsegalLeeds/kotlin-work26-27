// Task 5.2.2: conversion of marks into grades, using a function

fun main(args: Array<String>) {
    for (i in 0..(args.size - 1)){
        println("${args[i]} is a ${grade(args[i].toInt())}")
    }
}