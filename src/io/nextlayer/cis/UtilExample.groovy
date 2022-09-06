#!/usr/bin/env groovy
package io.nextlayer.cis

class UtilExample implements Serializable {
    private steps

    UtilExample() {

    }

    static String doSomething(steps, branch) {
        return "*************************************  Doing Something: " + steps.globals.isDevelopBranch(branch)
    }
}
