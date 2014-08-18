package javaposse.jobdsl.dsl.helpers.wrapper

import  javaposse.jobdsl.dsl.helpers.Context

class RbenvContext implements Context {
    String root = '$HOME/.rbenv'
    String rubyBuildRepository = 'https://github.com/sstephenson/ruby-build.git'
    String rubyBuildRevision = 'master'
    String rbenvRevision = 'master'
    String rbenvRepository = 'https://github.com/sstephenson/rbenv.git'
    String ignoreLocalVersion = 'FalseClass'

    def root(String root) {
        this.root = root
    }

    def rubyBuildRepository(String repo) {
        this.rubyBuildRepository = repo
    }

    def rubyBuildRevision(String rev) {
        this.rubyBuildRevision = rev
    }

    def rbenvRevision(String rev) {
        this.rbenvRevision = rev
    }

    def rbenvRepository(String repo) {
        this.rbenvRepository = repo
    }

    def ignoreLocalVersion(boolean ignore) {
        this.ignoreLocalVersion = ignore.toString().capitalize() + 'Class'
    }
}