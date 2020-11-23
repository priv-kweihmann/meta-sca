SUMMARY = "NPM: @babel/template"
DESCRIPTION = "Generate an AST from a string template."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-code-frame-native \
           npm-babel-parser-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/template/-/template-7.12.7.tgz"
SRC_URI[md5sum] = "110322a29096743adabf6ccea7717c22"
SRC_URI[sha256sum] = "5472c0456e5069184fae546bc5845617d6d0531857cca1d191b022d46efab9ff"

NPM_PKGNAME = "@babel/template"

inherit npmhelper
inherit native
