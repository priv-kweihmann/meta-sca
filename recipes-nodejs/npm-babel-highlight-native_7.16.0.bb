SUMMARY = "NPM: @babel/highlight"
DESCRIPTION = "Syntax highlight JavaScript strings for output in terminals."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-highlight"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-chalk-native \
           npm-js-tokens-native"

SRC_URI = "https://registry.npmjs.org/@babel/highlight/-/highlight-7.16.0.tgz"
SRC_URI[md5sum] = "057b75b269e095483853367bb4177a4b"
SRC_URI[sha256sum] = "dcca57fbc365c50b82b223939cf621e19b5e970279e51d65e5c5e0d24a9a7481"

NPM_PKGNAME = "@babel/highlight"

inherit npmhelper
inherit native
