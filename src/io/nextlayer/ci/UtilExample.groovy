#!/usr/bin/env groovy
package io.nextlayer.ci

class UtilExample implements Serializable {
    private steps

    UtilExample() {

    }

    Static String doSomething(steps, branch) {
        return "*************************************  Doing Something: " + steps.isDevelopBranch(branch)
    }
}
