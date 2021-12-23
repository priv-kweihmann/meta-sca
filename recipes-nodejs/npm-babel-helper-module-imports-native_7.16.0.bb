SUMMARY = "NPM: @babel/helper-module-imports"
DESCRIPTION = "Babel helper functions for inserting module loads"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-module-imports"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-imports/-/helper-module-imports-7.16.0.tgz"
SRC_URI[md5sum] = "ebf1d301060ad3793b6150e4de09027b"
SRC_URI[sha256sum] = "3a6a3c8b4545b69725f9f51e361bb0d2bc4ac6b35516d0c6be5cd8080786da89"

NPM_PKGNAME = "@babel/helper-module-imports"

inherit npmhelper
inherit native
