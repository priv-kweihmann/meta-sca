SUMMARY = "NPM: @secretlint/config-loader"
DESCRIPTION = "Config loader for secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-loader/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-debug-native \
           npm-rc-config-loader-native \
           npm-secretlint-config-validator-native \
           npm-secretlint-profiler-native \
           npm-secretlint-types-native \
           npm-textlint-module-interop-native \
           npm-try-resolve-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-loader/-/config-loader-3.1.0.tgz"
SRC_URI[md5sum] = "6b6f862416f7e6168615e8e35105cde5"
SRC_URI[sha256sum] = "6991c2350f54f7f6630e526a60a3a2854e9b09c41874fcf3f249a94b6ea0494a"

NPM_PKGNAME = "@secretlint/config-loader"

inherit npmhelper
inherit native
