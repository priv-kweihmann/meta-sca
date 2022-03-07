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

SRC_URI = "https://registry.npmjs.org/@secretlint/config-loader/-/config-loader-5.0.1.tgz"
SRC_URI[md5sum] = "db7ff8dea4d0b31a8630b71f7c843218"
SRC_URI[sha256sum] = "c05eb60ae75c9604a9ce4272f490a4f5a912ff9e472cc90b9fa8b41dca74bee0"

NPM_PKGNAME = "@secretlint/config-loader"

inherit npmhelper
inherit native
