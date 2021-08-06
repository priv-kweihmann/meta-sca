SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.15.0.tgz"
SRC_URI[md5sum] = "a5e100b226036a10ff5ea706f4ca60a9"
SRC_URI[sha256sum] = "b47f085371f1ae533214d55d0110e3df0dc0282f1dd1bf43901da150ebbcc8b3"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
