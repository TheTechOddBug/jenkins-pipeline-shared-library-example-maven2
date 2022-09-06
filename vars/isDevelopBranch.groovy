#!/usr/bin/env groovy

def call(String branch, String testParam) {
    return "develop".equals(branch)
}
