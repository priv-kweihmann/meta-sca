SUMMARY = "NPM: gingerbread"
DESCRIPTION = "A wrapper around Ginger proofreader."
HOMEPAGE = "https://github.com/robinvdvleuten/gingerbread#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=40873acaa3b5535833ef3aeea8fc025c"

DEPENDS = "npm-commander-native \
           npm-object-assign-native \
           npm-request-native"

SRC_URI = "https://registry.npmjs.org/gingerbread/-/gingerbread-0.6.0.tgz"
SRC_URI[md5sum] = "75a1cb829a302b43b2e7d8d5be641cc7"
SRC_URI[sha256sum] = "5978729f8f71148993d624ba66b47b1719b58052823fd0761a215b8fc062a455"

NPM_PKGNAME = "gingerbread"

inherit npmhelper
inherit native
