SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helpers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.13.10.tgz"
SRC_URI[md5sum] = "a2d77ffba5d88a5dd3afadc4859a2c3a"
SRC_URI[sha256sum] = "94c03710a9c4392e11da476e04acdcd3c6bb7081347461aee668ede68203b345"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
