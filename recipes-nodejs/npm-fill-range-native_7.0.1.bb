SUMMARY = "NPM: fill-range"
DESCRIPTION = "Fill in a range of numbers or letters, optionally passing an increment or `step` to use, or create a regex-compatible range with `options.toRegex`"
HOMEPAGE = "https://github.com/jonschlinkert/fill-range"

DEPENDS = "npm-to-regex-range-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b"

SRC_URI = "https://registry.npmjs.org/fill-range/-/fill-range-7.0.1.tgz"
SRC_URI[md5sum] = "279e60751b8b0e89226a9e9bd5b8f275"
SRC_URI[sha256sum] = "28cdfdbcf2b2d92ef67ed76097017c5220b0dee95898184d6c8dfde7781de972"

NPM_PKGNAME = "fill-range"

inherit npmhelper
inherit native
