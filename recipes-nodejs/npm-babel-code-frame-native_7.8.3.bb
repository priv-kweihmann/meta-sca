SUMMARY = "NPM: @babel/code-frame"
DESCRIPTION = "Generate errors that contain a code frame that point to source locations."
HOMEPAGE = "https://babeljs.io/"

DEPENDS = "npm-babel-highlight-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

SRC_URI = "https://registry.npmjs.org/@babel/code-frame/-/code-frame-7.8.3.tgz"
SRC_URI[md5sum] = "02e64c9480dfa731e02294f0dc95e956"
SRC_URI[sha256sum] = "d1194c4856a86fd5171d5ca8ccd2b0bc96898e841f9d28ef4a65e5b12c5303f0"

NPM_PKGNAME = "@babel/code-frame"

inherit npmhelper
inherit native
