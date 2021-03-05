SUMMARY = "NPM: @babel/highlight"
DESCRIPTION = "Syntax highlight JavaScript strings for output in terminals."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-highlight"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-chalk-native \
           npm-js-tokens-native"

SRC_URI = "https://registry.npmjs.org/@babel/highlight/-/highlight-7.13.8.tgz"
SRC_URI[md5sum] = "7aa0cfbd9b7b8141f0d8ab69f13a77cf"
SRC_URI[sha256sum] = "cd0248ba3d0b447ba0471b9212aa90b9a92d7a11f9e65b7039c54e20066ffab5"

NPM_PKGNAME = "@babel/highlight"

inherit npmhelper
inherit native
