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

SRC_URI = "https://registry.npmjs.org/@secretlint/config-loader/-/config-loader-2.1.1.tgz"
SRC_URI[md5sum] = "4b127dcb11b1cb6b654f4984b0ce3e22"
SRC_URI[sha256sum] = "658e5aefd5615f822781f059b63dd0ba1897e5076decf4a10413404c5050afd1"

NPM_PKGNAME = "@secretlint/config-loader"

inherit npmhelper
inherit native
