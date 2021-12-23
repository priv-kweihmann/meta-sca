SUMMARY = "NPM: no-case"
DESCRIPTION = "Transform into a lower cased string with spaces between words"
HOMEPAGE = "https://github.com/blakeembrey/change-case/tree/master/packages/no-case#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=44088ba57cb871a58add36ce51b8de08"

DEPENDS = "npm-lower-case-native \
           npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/no-case/-/no-case-3.0.4.tgz"
SRC_URI[md5sum] = "2b581d59e42250a8f2c54eae62ebd5c6"
SRC_URI[sha256sum] = "303fececf83fa9e35be5e7f2746db70fc6ddd07272d12aa4fef0a3abec8fc699"

NPM_PKGNAME = "no-case"

inherit npmhelper
inherit native
