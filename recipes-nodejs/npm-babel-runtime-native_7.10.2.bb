SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babeljs.io/docs/en/next/babel-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.10.2.tgz"
SRC_URI[md5sum] = "9c8df3dc4cec5a1570837a27f6b7152f"
SRC_URI[sha256sum] = "04820cfaa102179b7ce0864b586759bd00ad043d1037f3d0f633545606fbb89f"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
