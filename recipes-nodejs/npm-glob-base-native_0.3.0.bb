SUMMARY = "NPM: glob-base"
DESCRIPTION = "Returns an object with the (non-glob) base path and the actual pattern."
HOMEPAGE = "https://github.com/jonschlinkert/glob-base"

DEPENDS = "npm-glob-parent-native npm-is-glob-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e060235353cb686ae1695ec7db63cfbc"

SRC_URI = "https://registry.npmjs.org/glob-base/-/glob-base-0.3.0.tgz"
SRC_URI[md5sum] = "ea2fd4074a1f129431de415f1c5387aa"
SRC_URI[sha256sum] = "c7aa93cb5439345a22efef1ec734c5c7a68e236d34d916e108e3aeb826eda8a5"

S = "${WORKDIR}/package"

NPM_PKGNAME = "glob-base"

inherit npmhelper
inherit native
