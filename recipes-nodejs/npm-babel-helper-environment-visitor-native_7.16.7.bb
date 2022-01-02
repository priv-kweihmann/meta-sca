SUMMARY = "NPM: @babel/helper-environment-visitor"
DESCRIPTION = "Helper visitor to only visit nodes in the current 'this' context"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-environment-visitor"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-environment-visitor/-/helper-environment-visitor-7.16.7.tgz"
SRC_URI[md5sum] = "c5728d1ab5fea8959f6be3e4afb2e0cb"
SRC_URI[sha256sum] = "ba9a21976a417bceb8aa7023b06cfdac5e5d1c27b194aeb00d401a932cc75787"

NPM_PKGNAME = "@babel/helper-environment-visitor"

inherit npmhelper
inherit native
