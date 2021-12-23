SUMMARY = "NPM: @babel/helper-environment-visitor"
DESCRIPTION = "Helper visitor to only visit nodes in the current 'this' context"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-environment-visitor"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-environment-visitor/-/helper-environment-visitor-7.16.5.tgz"
SRC_URI[md5sum] = "9830d8b472744456830b0e7fa814e964"
SRC_URI[sha256sum] = "f53b48ea826d3ef40f4dc7b90e883b926de9a32530d05d5c5db6153eac5b90a9"

NPM_PKGNAME = "@babel/helper-environment-visitor"

inherit npmhelper
inherit native
