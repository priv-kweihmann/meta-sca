SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.11.2.tgz"
SRC_URI[md5sum] = "3c4ced4036b7afada0966d380aa91320"
SRC_URI[sha256sum] = "1f54420f956ec938b4a10e94488894d7721bb2058032158d0d0ee0ceec3f4533"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
