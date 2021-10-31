SUMMARY = "NPM: @babel/helper-compilation-targets"
DESCRIPTION = "Helper functions on Babel compilation targets"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-compat-data-native \
           npm-babel-helper-validator-option-native \
           npm-browserslist-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-compilation-targets/-/helper-compilation-targets-7.16.0.tgz"
SRC_URI[md5sum] = "f8462a193dee721ac166dfe7b6aedf22"
SRC_URI[sha256sum] = "efb27e995aa225350da186ee0f989f2edaa73c2dde94afca8c406e1d6aa38c43"

NPM_PKGNAME = "@babel/helper-compilation-targets"

inherit npmhelper
inherit native
