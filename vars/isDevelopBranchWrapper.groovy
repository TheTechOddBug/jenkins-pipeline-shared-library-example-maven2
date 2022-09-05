#!/usr/bin/env groovy

def call(String branch) {
    load('./isDevelopBranch.groovy')
    return isDevelopBranch(branch)
}
