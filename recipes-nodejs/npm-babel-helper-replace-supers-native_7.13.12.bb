SUMMARY = "NPM: @babel/helper-replace-supers"
DESCRIPTION = "Helper function to replace supers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-replace-supers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-member-expression-to-functions-native \
           npm-babel-helper-optimise-call-expression-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-replace-supers/-/helper-replace-supers-7.13.12.tgz"
SRC_URI[md5sum] = "6e901dd640a09a8e1e8e49dc250fe39a"
SRC_URI[sha256sum] = "28cfbcca3c738ed0172e97145a47e28d985d9febb33231992bf3ba816a5f7e66"

NPM_PKGNAME = "@babel/helper-replace-supers"

inherit npmhelper
inherit native
