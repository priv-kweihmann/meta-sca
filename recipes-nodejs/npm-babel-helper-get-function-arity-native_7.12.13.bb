SUMMARY = "NPM: @babel/helper-get-function-arity"
DESCRIPTION = "Helper function to get function arity"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-get-function-arity"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-get-function-arity/-/helper-get-function-arity-7.12.13.tgz"
SRC_URI[md5sum] = "7a40ffef4058eead9c8b98d56d03ccc4"
SRC_URI[sha256sum] = "516342bff750abb2e2200520e63156dbf7b58cd3764cf5a26517a0c45ec32b9f"

NPM_PKGNAME = "@babel/helper-get-function-arity"

inherit npmhelper
inherit native
