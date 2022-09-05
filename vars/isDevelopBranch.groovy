#!/usr/bin/env groovy

def call(String branch) {
    return "develop".equals(branch)
}

def call(String branch, Boolean wrapper = true) {
    return "develop".equals(branch)
}
