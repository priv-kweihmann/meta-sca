SUMMARY = "NPM: param-case"
DESCRIPTION = "Transform into a lower cased string with dashes between words"
HOMEPAGE = "https://github.com/blakeembrey/change-case/tree/master/packages/param-case#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=44088ba57cb871a58add36ce51b8de08"

DEPENDS = "npm-dot-case-native \
           npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/param-case/-/param-case-3.0.4.tgz"
SRC_URI[md5sum] = "f3a3f89a9ebbe0c1893c4f4f50838ee6"
SRC_URI[sha256sum] = "1a99e84c81daccbd46ac81096b7ecc1fc16177031320f0158f156e08e0453b7c"

NPM_PKGNAME = "param-case"

inherit npmhelper
inherit native
