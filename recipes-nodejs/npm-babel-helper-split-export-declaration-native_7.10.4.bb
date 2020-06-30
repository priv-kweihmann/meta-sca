SUMMARY = "NPM: @babel/helper-split-export-declaration"
DESCRIPTION = ">"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-split-export-declaration/-/helper-split-export-declaration-7.10.4.tgz"
SRC_URI[md5sum] = "9ccd681f23a6efbdaa8336060db941a5"
SRC_URI[sha256sum] = "8711893018f55ce4945fc8ecc6af88d8541945e17818eb54760dda717d648c33"

NPM_PKGNAME = "@babel/helper-split-export-declaration"

inherit npmhelper
inherit native
