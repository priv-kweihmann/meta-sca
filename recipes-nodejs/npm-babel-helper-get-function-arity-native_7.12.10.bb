SUMMARY = "NPM: @babel/helper-get-function-arity"
DESCRIPTION = "Helper function to get function arity"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-get-function-arity/-/helper-get-function-arity-7.12.10.tgz"
SRC_URI[md5sum] = "e80ab58cb94a658fdfc08dbff0423a2d"
SRC_URI[sha256sum] = "2362ae10f59faf33e35fc244dbb443c45164ce860c5a3334220977be8689a486"

NPM_PKGNAME = "@babel/helper-get-function-arity"

inherit npmhelper
inherit native
