SUMMARY = "NPM: @babel/template"
DESCRIPTION = "Generate an AST from a string template."
HOMEPAGE = "https://babeljs.io/"

DEPENDS = "npm-babel-code-frame-native npm-babel-parser-native npm-babel-types-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

SRC_URI = "https://registry.npmjs.org/@babel/template/-/template-7.8.6.tgz"
SRC_URI[md5sum] = "df139bdb5fc0f39b96855d894f936454"
SRC_URI[sha256sum] = "b0c26f79e80b059d1fbfa95f5fe5bcf34cd0ea1b340a034affc9c56ac713612e"

NPM_PKGNAME = "@babel/template"

inherit npmhelper
inherit native
