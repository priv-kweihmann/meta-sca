SUMMARY = "NPM: @babel/template"
DESCRIPTION = "Generate an AST from a string template."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-template"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-code-frame-native \
           npm-babel-parser-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/template/-/template-7.16.0.tgz"
SRC_URI[md5sum] = "8a09f72beab0b3bc9c68167289134550"
SRC_URI[sha256sum] = "5c1970fb0cf54b46000b6c3564dd91d83435ceb05b3a7b268c071c81400306f2"

NPM_PKGNAME = "@babel/template"

inherit npmhelper
inherit native
