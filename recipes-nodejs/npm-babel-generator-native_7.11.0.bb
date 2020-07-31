SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.11.0.tgz"
SRC_URI[md5sum] = "22739c0bede158e012e039c3c8aa8b5c"
SRC_URI[sha256sum] = "66be758892c734eedf3501d85eb23810454bc4f82ecfa51dff2e2989ab85fb81"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
