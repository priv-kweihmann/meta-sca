SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.11.4.tgz"
SRC_URI[md5sum] = "99904a8e06b0f77c80190a19efdceb14"
SRC_URI[sha256sum] = "583f8ae6e1205cc8cf583a79ab3e854e5baff508cb1f92d23b57960ce1029156"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
