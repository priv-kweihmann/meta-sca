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

SRC_URI = "https://registry.npmjs.org/@secretlint/config-loader/-/config-loader-3.0.0.tgz"
SRC_URI[md5sum] = "4ee4b48e3f177b23bfe7a8ee848e44a8"
SRC_URI[sha256sum] = "964d7d2fc9de982da1be36c4e6702335754308e56e5a251b9de2db9bfe1c2be2"

NPM_PKGNAME = "@secretlint/config-loader"

inherit npmhelper
inherit native
