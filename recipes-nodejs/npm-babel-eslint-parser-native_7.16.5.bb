SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.16.5.tgz"
SRC_URI[md5sum] = "f1152fc8de30379e51fb3ef3c3de4eff"
SRC_URI[sha256sum] = "cb1275d9d9b3c02f7daf628d87222a16783e1f0ed78f7e1a57c2de5a53977b05"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
