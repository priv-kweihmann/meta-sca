SUMMARY = "NPM: @babel/template"
DESCRIPTION = "Generate an AST from a string template."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-code-frame-native \
           npm-babel-parser-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/template/-/template-7.10.0.tgz"
SRC_URI[md5sum] = "3389a31ec950fc92bcbd793a2e46d692"
SRC_URI[sha256sum] = "3d1a25ba706d41591b2acf2391c2e00eb116583031e13b95da56e546a1ccea3e"

NPM_PKGNAME = "@babel/template"

inherit npmhelper
inherit native
