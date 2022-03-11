SUMMARY = "NPM: @secretlint/config-loader"
DESCRIPTION = "Config loader for secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-loader/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-ajv-native \
           npm-debug-native \
           npm-rc-config-loader-native \
           npm-secretlint-profiler-native \
           npm-secretlint-types-native \
           npm-try-resolve-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-loader/-/config-loader-5.1.0.tgz"
SRC_URI[md5sum] = "7db16f85e9e1a0effaa724e851f11bf4"
SRC_URI[sha256sum] = "c24de7c356f65fad44c7449823505fb2eeb07dbb4cf336688e84bbfc07f2032b"

NPM_PKGNAME = "@secretlint/config-loader"

inherit npmhelper
inherit native
