SUMMARY = "NPM: @babel/template"
DESCRIPTION = "Generate an AST from a string template."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-code-frame-native \
           npm-babel-parser-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/template/-/template-7.10.4.tgz"
SRC_URI[md5sum] = "e36c078182a90c88d4f91d745a9c97b1"
SRC_URI[sha256sum] = "0c1b17bb5d4b2afd8db7fec6f80fcc2098ad3e3885af7f7949105921c11e411b"

NPM_PKGNAME = "@babel/template"

inherit npmhelper
inherit native
