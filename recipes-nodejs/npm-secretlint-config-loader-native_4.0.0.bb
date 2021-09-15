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
           npm-try-resolve-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-loader/-/config-loader-4.0.0.tgz"
SRC_URI[md5sum] = "78db1a3c436c448b3d9525ec0391c79e"
SRC_URI[sha256sum] = "640df23bc895ae98e250fec500e6c75ce6fca2045dfa33ab262b088455f47049"

NPM_PKGNAME = "@secretlint/config-loader"

inherit npmhelper
inherit native
