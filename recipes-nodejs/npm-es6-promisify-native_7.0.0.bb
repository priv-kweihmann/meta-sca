SUMMARY = "NPM: es6-promisify"
DESCRIPTION = "Converts callback-based functions to ES6 Promises"
HOMEPAGE = "https://github.com/mikehall314/es6-promisify#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=51033e76f9792283c8985624ba2694e8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/es6-promisify/-/es6-promisify-7.0.0.tgz"
SRC_URI[md5sum] = "110eec99b5872e303704b85e51ac4191"
SRC_URI[sha256sum] = "d831e7417aea7bbd94128826354141a5f05ddea4693b9b95745c0a692736a9f5"

NPM_PKGNAME = "es6-promisify"

inherit npmhelper
inherit native
