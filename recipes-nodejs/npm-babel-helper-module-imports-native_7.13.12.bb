SUMMARY = "NPM: @babel/helper-module-imports"
DESCRIPTION = "Babel helper functions for inserting module loads"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-module-imports"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-imports/-/helper-module-imports-7.13.12.tgz"
SRC_URI[md5sum] = "9610527b04a97c101a951bde9247595f"
SRC_URI[sha256sum] = "50fbc2e5a56300184c476359983f60930e79fe0f3f916cd8aa5c3bec54aade09"

NPM_PKGNAME = "@babel/helper-module-imports"

inherit npmhelper
inherit native
