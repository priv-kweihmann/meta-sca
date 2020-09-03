SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.11.5.tgz"
SRC_URI[md5sum] = "4c35c711615e28507a3654afa02e150f"
SRC_URI[sha256sum] = "14044049bf0f9a2c62f4c4f17ac8ce9d0a5e3269b8b1294418cff80c020990c7"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
