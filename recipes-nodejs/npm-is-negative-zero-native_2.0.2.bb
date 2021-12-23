SUMMARY = "NPM: is-negative-zero"
DESCRIPTION = "Is this value negative zero? === will lie to you"
HOMEPAGE = "https://github.com/inspect-js/is-negative-zero"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-negative-zero/-/is-negative-zero-2.0.2.tgz"
SRC_URI[md5sum] = "0b44a640179fbf8b79bfbbec6a583cbd"
SRC_URI[sha256sum] = "ec49e5479930b982f3ba208ccf366a5b711957865ae2b3cab9ce53cea85656bb"

NPM_PKGNAME = "is-negative-zero"

inherit npmhelper
inherit native
