SUMMARY = "NPM: is-object"
DESCRIPTION = "Checks whether a value is an object"
HOMEPAGE = "https://github.com/inspect-js/is-object"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1c841959f01a2fc8da6242c32371b50"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-object/-/is-object-1.0.2.tgz"
SRC_URI[md5sum] = "f18c62db8af2fa38200a0b9234cf7643"
SRC_URI[sha256sum] = "aa37252c9d198f0c8cacdc11c764738668f7cdb2eee31f32f3b5f97f259094df"

NPM_PKGNAME = "is-object"

inherit npmhelper
inherit native
