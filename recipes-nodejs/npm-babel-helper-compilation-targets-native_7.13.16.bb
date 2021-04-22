SUMMARY = "NPM: @babel/helper-compilation-targets"
DESCRIPTION = "Helper functions on Babel compilation targets"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-compat-data-native \
           npm-babel-helper-validator-option-native \
           npm-browserslist-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-compilation-targets/-/helper-compilation-targets-7.13.16.tgz"
SRC_URI[md5sum] = "976d62e3ef568c96b2f0c276e83306a2"
SRC_URI[sha256sum] = "133ab331cab5cb3b69ad23ebba099201ab59745ac75e58582cec046241c627ea"

NPM_PKGNAME = "@babel/helper-compilation-targets"

inherit npmhelper
inherit native
