SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-lodash-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.10.0.tgz"
SRC_URI[md5sum] = "4f977be0d8a0c9e4ead56714eed901ae"
SRC_URI[sha256sum] = "bbc7953c319410feb2b499e09ef71e7697ca1647d8501e31e89c4e9d99cc6dca"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
