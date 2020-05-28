SUMMARY = "NPM: @babel/template"
DESCRIPTION = "Generate an AST from a string template."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-code-frame-native \
           npm-babel-parser-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/template/-/template-7.10.1.tgz"
SRC_URI[md5sum] = "19adf51cba746f6e4bd3b339ef0a17dd"
SRC_URI[sha256sum] = "0dd51bf7e8bfd426ff28970a1948556582d6c623ab21dcadeed23f7c1b5361e0"

NPM_PKGNAME = "@babel/template"

inherit npmhelper
inherit native
