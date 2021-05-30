SUMMARY = "NPM: @babel/helper-compilation-targets"
DESCRIPTION = "Helper functions on Babel compilation targets"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-compat-data-native \
           npm-babel-helper-validator-option-native \
           npm-browserslist-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-compilation-targets/-/helper-compilation-targets-7.14.4.tgz"
SRC_URI[md5sum] = "f554243267b0ff9b1c84a92f506a8629"
SRC_URI[sha256sum] = "e264ec0af32b9449c637a6d740ecfc4e0bb31ba202c3a42d198fe704c946705c"

NPM_PKGNAME = "@babel/helper-compilation-targets"

inherit npmhelper
inherit native
