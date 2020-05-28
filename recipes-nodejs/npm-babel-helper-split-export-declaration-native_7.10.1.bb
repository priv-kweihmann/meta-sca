SUMMARY = "NPM: @babel/helper-split-export-declaration"
DESCRIPTION = ">"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-split-export-declaration/-/helper-split-export-declaration-7.10.1.tgz"
SRC_URI[md5sum] = "92789ad0d13698db9979f349ecff7157"
SRC_URI[sha256sum] = "43131a21327af0a0fcf421acacc58c35012e05a297cf3ffe6e28bc18030131f6"

NPM_PKGNAME = "@babel/helper-split-export-declaration"

inherit npmhelper
inherit native
