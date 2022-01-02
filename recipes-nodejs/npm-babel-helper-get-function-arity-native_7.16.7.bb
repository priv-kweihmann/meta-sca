SUMMARY = "NPM: @babel/helper-get-function-arity"
DESCRIPTION = "Helper function to get function arity"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-get-function-arity"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-get-function-arity/-/helper-get-function-arity-7.16.7.tgz"
SRC_URI[md5sum] = "f11bd3474d17bc12735a2462d08fa093"
SRC_URI[sha256sum] = "0db0f2c529b0dc0cac0d8f2e1197ce16434f273d381a3a09d1fa39c627d7fd69"

NPM_PKGNAME = "@babel/helper-get-function-arity"

inherit npmhelper
inherit native
