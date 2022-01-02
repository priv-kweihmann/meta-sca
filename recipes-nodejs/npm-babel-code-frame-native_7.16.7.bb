SUMMARY = "NPM: @babel/code-frame"
DESCRIPTION = "Generate errors that contain a code frame that point to source locations."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-code-frame"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-highlight-native"

SRC_URI = "https://registry.npmjs.org/@babel/code-frame/-/code-frame-7.16.7.tgz"
SRC_URI[md5sum] = "31af46ce2c742b38161a12651c99e09e"
SRC_URI[sha256sum] = "f45cf383e8c261cf4134b7800dd64d66e3b2d05aac2c20b5069da6b42531ab81"

NPM_PKGNAME = "@babel/code-frame"

inherit npmhelper
inherit native
