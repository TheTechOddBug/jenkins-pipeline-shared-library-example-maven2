#!/usr/bin/env groovy

def call(String branch) {
    return "develop".equals(branch)
}
