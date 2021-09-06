SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.15.4.tgz"
SRC_URI[md5sum] = "831aad37536b82a0e138a75efa2f58fd"
SRC_URI[sha256sum] = "fb982d14828621aa4672bfccff28b3250da308af56084d2b39bbe9c8d67b8515"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
