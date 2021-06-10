SUMMARY = "NPM: @babel/helper-get-function-arity"
DESCRIPTION = "Helper function to get function arity"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-get-function-arity"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-get-function-arity/-/helper-get-function-arity-7.14.5.tgz"
SRC_URI[md5sum] = "9467ba67a0a997a5d9f81221466ef41a"
SRC_URI[sha256sum] = "62d195382ffe2257e45545c2ea38d845d3f653487a06b85d2841f63a8aef908d"

NPM_PKGNAME = "@babel/helper-get-function-arity"

inherit npmhelper
inherit native
