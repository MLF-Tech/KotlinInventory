#!/bin/bash
/Users/marialaurafagioli/Downloads/kotlinc/bin/kotlinc Inventory.kt -include-runtime -d inventory.jar
java -jar inventory.jar