SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.13.0.tgz"
SRC_URI[md5sum] = "fafd9ec0affe7136d2aa1f104cd0529c"
SRC_URI[sha256sum] = "6dc1dc71d5b0d44352e92c07f94fa28057cedbc5ce835f1e44e35c889bcfca19"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
