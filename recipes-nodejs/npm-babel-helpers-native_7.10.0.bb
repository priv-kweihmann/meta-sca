SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.10.0.tgz"
SRC_URI[md5sum] = "a40f10c87ac60d416502423a58adfe53"
SRC_URI[sha256sum] = "b1ecb0a1f2cd3274c5edaee8b7afa749648ffd71f52bb6234c841ab782447d90"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
