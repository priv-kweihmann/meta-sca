SUMMARY = "NPM: @babel/helper-function-name"
DESCRIPTION = "Helper function to change the property 'name' of every function"
DEPENDS = "npm-babel-helper-get-function-arity-native npm-babel-template-native npm-babel-types-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

SRC_URI = "https://registry.npmjs.org/@babel/helper-function-name/-/helper-function-name-7.9.5.tgz"
SRC_URI[md5sum] = "211f26363c3511996d72374796c42d4d"
SRC_URI[sha256sum] = "46d75d01bf2a2d3c450b2c2725bc83f8674a4292f4d298520036e3d5a55c7faf"

NPM_PKGNAME = "@babel/helper-function-name"

inherit npmhelper
inherit native
