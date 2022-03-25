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

SRC_URI = "https://registry.npmjs.org/@secretlint/config-loader/-/config-loader-5.1.1.tgz"
SRC_URI[md5sum] = "25f020315eac100096d10c71ee46e202"
SRC_URI[sha256sum] = "77029dc2dfbfd846cac2f1415e018258ff744893aeb6e29067fa2cf1c8dd5dd3"

NPM_PKGNAME = "@secretlint/config-loader"

inherit npmhelper
inherit native
