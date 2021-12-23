SUMMARY = "NPM: is-extglob"
DESCRIPTION = "Returns true if a string has an extglob."
HOMEPAGE = "https://github.com/jonschlinkert/is-extglob"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=97b255bb4707da164bfaf4e5c7b9f9ef"

SRC_URI = "https://registry.npmjs.org/is-extglob/-/is-extglob-2.1.1.tgz"
SRC_URI[md5sum] = "f84c2f17059e807664dd8e3acc0c34c5"
SRC_URI[sha256sum] = "8c5d4286146ad62fc1096981700ce1c22a167708926fca01f9ca74f9bb50bc19"

NPM_PKGNAME = "is-extglob"

inherit npmhelper
inherit native
