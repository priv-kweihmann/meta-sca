SUMMARY = "NPM: @secretlint/config-loader"
DESCRIPTION = "Config loader for secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-loader/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-debug-native \
           npm-rc-config-loader-native \
           npm-secretlint-config-validator-native \
           npm-secretlint-profiler-native \
           npm-secretlint-types-native \
           npm-try-resolve-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-loader/-/config-loader-4.2.0.tgz"
SRC_URI[md5sum] = "4330ab1f4adfd965db7b31d5eb3cd0d4"
SRC_URI[sha256sum] = "54d64790db4be945429af972b2844502639e0cfc1a633a10b56db04c5c60bfb3"

NPM_PKGNAME = "@secretlint/config-loader"

inherit npmhelper
inherit native
