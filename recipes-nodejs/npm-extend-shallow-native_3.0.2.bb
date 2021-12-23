SUMMARY = "NPM: extend-shallow"
DESCRIPTION = "Extend an object with the properties of additional objects. node.js/javascript util."
HOMEPAGE = "https://github.com/jonschlinkert/extend-shallow"

DEPENDS = "npm-assign-symbols-native npm-is-extendable-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4e0921625c33cf4e6990a6416848a6e5"

SRC_URI = "https://registry.npmjs.org/extend-shallow/-/extend-shallow-3.0.2.tgz"
SRC_URI[md5sum] = "194095206e18756d832f5e0ad3d71cb8"
SRC_URI[sha256sum] = "a01acad649571a4afc14ac53871ba89c362664c17b65d1a3ebd949bad8647109"

NPM_PKGNAME = "extend-shallow"

inherit npmhelper
inherit native
