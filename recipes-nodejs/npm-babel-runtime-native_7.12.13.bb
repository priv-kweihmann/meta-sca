SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.12.13.tgz"
SRC_URI[md5sum] = "07a8464a0f779c887f47cf008f3afd78"
SRC_URI[sha256sum] = "2e2111a9bb92b2001f33cde682461daf6afe3aa0ac98f4de866a835070543621"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
