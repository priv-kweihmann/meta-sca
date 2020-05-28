SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babeljs.io/docs/en/next/babel-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.10.1.tgz"
SRC_URI[md5sum] = "fd373e9c67765f596da693889681e95d"
SRC_URI[sha256sum] = "01fa69475aa5492500656c8ce5186fab01b9a284f9668e5bdb7690c387bcc6e1"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
