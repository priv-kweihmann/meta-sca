SUMMARY = "NPM: @babel/code-frame"
DESCRIPTION = "Generate errors that contain a code frame that point to source locations."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-highlight-native"

SRC_URI = "https://registry.npmjs.org/@babel/code-frame/-/code-frame-7.12.11.tgz"
SRC_URI[md5sum] = "586b308ecf8c06d626be06984a56fe2a"
SRC_URI[sha256sum] = "d373f65323b8ee756de80fe5d3ba25dc4487f6c1dc3901a98419e49ab9af14c4"

NPM_PKGNAME = "@babel/code-frame"

inherit npmhelper
inherit native
