SUMMARY = "NPM: @babel/helper-hoist-variables"
DESCRIPTION = "Helper function to hoist variables"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-hoist-variables"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-hoist-variables/-/helper-hoist-variables-7.15.4.tgz"
SRC_URI[md5sum] = "58c474ccd457d54dfdfbbbdc81a28f2d"
SRC_URI[sha256sum] = "55f465bad32a8dce5632227efda96f6d1ff29e4682c913d500fa07a43e30648b"

NPM_PKGNAME = "@babel/helper-hoist-variables"

inherit npmhelper
inherit native
