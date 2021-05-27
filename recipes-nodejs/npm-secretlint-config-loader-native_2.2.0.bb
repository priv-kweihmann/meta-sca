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

SRC_URI = "https://registry.npmjs.org/@secretlint/config-loader/-/config-loader-2.2.0.tgz"
SRC_URI[md5sum] = "4a8535740b4a9d3b06da92bd6ef54f8d"
SRC_URI[sha256sum] = "fc9a22594390e47bd19cbe5a64f3967d97dd7eb9b5d676de84e6803312e19629"

NPM_PKGNAME = "@secretlint/config-loader"

inherit npmhelper
inherit native
