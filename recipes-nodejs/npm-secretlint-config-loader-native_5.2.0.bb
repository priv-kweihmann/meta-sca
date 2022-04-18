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

SRC_URI = "https://registry.npmjs.org/@secretlint/config-loader/-/config-loader-5.2.0.tgz"
SRC_URI[md5sum] = "57e371f9ccf5a42c3a747024dbeb557a"
SRC_URI[sha256sum] = "bf85e22a69797c6305e760c9b8dd08c1255190ebd4cc61864e996ffff4c13f2b"

NPM_PKGNAME = "@secretlint/config-loader"

inherit npmhelper
inherit native
