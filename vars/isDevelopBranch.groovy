#!/usr/bin/env groovy

def invokingGlobalLibrary(String branch) {
    return isDevelopBranch(branch)
}
