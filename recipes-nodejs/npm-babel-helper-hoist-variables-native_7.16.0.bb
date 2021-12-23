SUMMARY = "NPM: @babel/helper-hoist-variables"
DESCRIPTION = "Helper function to hoist variables"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-hoist-variables"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-hoist-variables/-/helper-hoist-variables-7.16.0.tgz"
SRC_URI[md5sum] = "7a6fbd9c351d2781b0c024d2e128ddea"
SRC_URI[sha256sum] = "9cc4d083e1a603607d008ba8179f8e9e7e081e77081d6184d2e0b27fa6795b6a"

NPM_PKGNAME = "@babel/helper-hoist-variables"

inherit npmhelper
inherit native
