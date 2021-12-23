SUMMARY = "NPM: @babel/code-frame"
DESCRIPTION = "Generate errors that contain a code frame that point to source locations."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-code-frame"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-highlight-native"

SRC_URI = "https://registry.npmjs.org/@babel/code-frame/-/code-frame-7.16.0.tgz"
SRC_URI[md5sum] = "31b6e7e1b090d2b1fb04bffc41fae92a"
SRC_URI[sha256sum] = "284003838b007ee74da4aa87abb283a64ea59a1a2f8b3dbdb2d772bd2839fd6a"

NPM_PKGNAME = "@babel/code-frame"

inherit npmhelper
inherit native
