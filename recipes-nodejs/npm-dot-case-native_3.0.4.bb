SUMMARY = "NPM: dot-case"
DESCRIPTION = "Transform into a lower case string with a period between words"
HOMEPAGE = "https://github.com/blakeembrey/change-case/tree/master/packages/dot-case#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=44088ba57cb871a58add36ce51b8de08"

DEPENDS = "npm-no-case-native \
           npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/dot-case/-/dot-case-3.0.4.tgz"
SRC_URI[md5sum] = "d0506fe1d0593af4bc73a7d9ac1f5a59"
SRC_URI[sha256sum] = "82799b1dbd09d05b59eab28afb83c4a10a23e61b38dc51160e90f70eab58daeb"

NPM_PKGNAME = "dot-case"

inherit npmhelper
inherit native
