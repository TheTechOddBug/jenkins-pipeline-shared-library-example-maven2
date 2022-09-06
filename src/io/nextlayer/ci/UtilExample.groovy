#!/usr/bin/env groovy
package io.nextlayer.ci

class UtilExample implements Serializable {
    private steps

    UtilExample() {

    }

    static String doSomething(steps, branch) {
        return "*************************************  Doing Something: " + steps.isDevelopBranch(branch)
    }
}
