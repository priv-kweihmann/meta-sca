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

SRC_URI = "https://registry.npmjs.org/@secretlint/config-loader/-/config-loader-5.1.3.tgz"
SRC_URI[md5sum] = "be216313a037fda1c824937b6d02994d"
SRC_URI[sha256sum] = "a414547c0db8268f775a087f745dd4bfcb99b857bebec09221c49e5f74b85a22"

NPM_PKGNAME = "@secretlint/config-loader"

inherit npmhelper
inherit native
