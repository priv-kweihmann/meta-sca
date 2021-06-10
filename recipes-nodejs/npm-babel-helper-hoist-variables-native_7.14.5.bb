SUMMARY = "NPM: @babel/helper-hoist-variables"
DESCRIPTION = "Helper function to hoist variables"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-hoist-variables"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-hoist-variables/-/helper-hoist-variables-7.14.5.tgz"
SRC_URI[md5sum] = "0a95d19321f3b7ce05623927161864ce"
SRC_URI[sha256sum] = "ef88137383bec93ce1640c0d742f4bcce18f41d9cb745aef4474b860a2d3341a"

NPM_PKGNAME = "@babel/helper-hoist-variables"

inherit npmhelper
inherit native
