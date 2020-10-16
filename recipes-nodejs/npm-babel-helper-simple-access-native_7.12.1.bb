SUMMARY = "NPM: @babel/helper-simple-access"
DESCRIPTION = "Babel helper for ensuring that access to a given value is performed through simple accesses"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-simple-access/-/helper-simple-access-7.12.1.tgz"
SRC_URI[md5sum] = "fcb85747ef9988881e9775ba7a4c64b6"
SRC_URI[sha256sum] = "a68b1015aada5d40cd556bbf27c4156b1e0854552e93685c6e74cb5e3f6fe688"

NPM_PKGNAME = "@babel/helper-simple-access"

inherit npmhelper
inherit native
