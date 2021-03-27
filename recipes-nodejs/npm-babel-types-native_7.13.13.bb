SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.13.13.tgz"
SRC_URI[md5sum] = "53f530a251b5f8f4c6ace2e1d33835c7"
SRC_URI[sha256sum] = "51bd82cfe798b7ec882ae79a896c6c76c281f23ba1f71430852862eb61d753bd"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
