SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helpers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.15.4.tgz"
SRC_URI[md5sum] = "ef538b38810d53b400f959db0e8884b0"
SRC_URI[sha256sum] = "0b0e0782ad1494585c2350443fd16d3c73359404d6b30d9ba9cd4092e4d498a5"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
