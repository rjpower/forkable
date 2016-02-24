#!/bin/bash

time CLASSPATH=$(find . -name '*.jar' | xargs | sed -e 's/ /:/g') scala -J-Xmx1g -J-Xms1g org.allenai.ProcessIt

time CLASSPATH=$(find . -name '*.jar' | xargs | sed -e 's/ /:/g') scala -J-Xmx1g -J-Xms1g org.allenai.ForkIt
