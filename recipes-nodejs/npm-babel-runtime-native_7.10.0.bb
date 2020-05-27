SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babeljs.io/docs/en/next/babel-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.10.0.tgz"
SRC_URI[md5sum] = "08bbd6ed0d8ab40d3a90cee4b64897b1"
SRC_URI[sha256sum] = "3c82d919febdd8a56a236ea56cc5efe09baade303b021d447eebcc382cec8bbc"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
