SUMMARY = "NPM: @babel/helper-get-function-arity"
DESCRIPTION = "Helper function to get function arity"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-get-function-arity"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-get-function-arity/-/helper-get-function-arity-7.16.0.tgz"
SRC_URI[md5sum] = "494cc669bde495104c0d3b7c4db4a441"
SRC_URI[sha256sum] = "192fab61932bbec8105c119ffae4caf4c006502ecda8b6dc8e77d6d2e9e76e5a"

NPM_PKGNAME = "@babel/helper-get-function-arity"

inherit npmhelper
inherit native
