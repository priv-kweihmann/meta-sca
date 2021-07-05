SUMMARY = "NPM: secretlint"
DESCRIPTION = "Secretlint CLI that scan secret/credential data."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/secretlint/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-debug-native \
           npm-globby-native \
           npm-meow-native \
           npm-read-pkg-native \
           npm-secretlint-config-creator-native \
           npm-secretlint-formatter-native \
           npm-secretlint-node-native \
           npm-secretlint-profiler-native"

SRC_URI = "https://registry.npmjs.org/secretlint/-/secretlint-3.3.0.tgz"
SRC_URI[md5sum] = "205880f2d68c1b8240511310a150cffe"
SRC_URI[sha256sum] = "ab41da9cf44534d5a8c4b8428bec7d1b03276c4c65cdabe335304bd6837cc043"

NPM_PKGNAME = "secretlint"

inherit npmhelper
inherit native
