package JavaOOPs.AccessModifiers;

public class ClassA {
  protected int m1;
}

// Protected Members = Can be accessed within same package(default) + Can be accessed by using child
// class using inheritance.

// Protected Class =  1.Can be accessed within same package(default) +
// 2. 'using the inheritance';
// but there is no concept package inheritance that's why even subpackages are considered as
// different package not th subpackage inheritance

// Since  default case is already covered by default class and pkg ineritance doesn't exist so
// that's why protected top level classes doesn't exist
