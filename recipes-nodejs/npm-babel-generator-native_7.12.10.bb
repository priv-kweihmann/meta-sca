SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.12.10.tgz"
SRC_URI[md5sum] = "8baf3d874ef4b467ce791f6e012ac692"
SRC_URI[sha256sum] = "e9e1f35c81c0c8940688be88e03f05478f20b08eed53598489ce8fd637ff8fed"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
