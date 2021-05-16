SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.14.2.tgz"
SRC_URI[md5sum] = "12db564f71eb1ecad3383317657ee288"
SRC_URI[sha256sum] = "a52d70c430a5aa3f5c65686c3b94b1d891cd7df4b836d9b7b5a0f4e29c440ce8"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
