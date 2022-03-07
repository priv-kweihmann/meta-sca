SUMMARY = "NPM: secretlint"
DESCRIPTION = "Secretlint CLI that scan secret/credential data."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/secretlint/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
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

SRC_URI = "https://registry.npmjs.org/secretlint/-/secretlint-5.0.1.tgz"
SRC_URI[md5sum] = "9ceee0cf6f84bb35b0bd9fe4ecb22fce"
SRC_URI[sha256sum] = "804b43d76507cce31ba722488419334ad5ceaf6ace3cf51f7d555013e9b2b74f"

NPM_PKGNAME = "secretlint"

inherit npmhelper
inherit native
