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

SRC_URI = "https://registry.npmjs.org/@secretlint/config-loader/-/config-loader-3.3.0.tgz"
SRC_URI[md5sum] = "ad2afc8cc2a23e2ec6807332fa56948c"
SRC_URI[sha256sum] = "2a56140ed6f681c1f5411782e56e1285e70f4283dfccba4b84796839eebc42d2"

NPM_PKGNAME = "@secretlint/config-loader"

inherit npmhelper
inherit native
