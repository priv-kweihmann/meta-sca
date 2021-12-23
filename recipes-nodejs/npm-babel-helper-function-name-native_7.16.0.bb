SUMMARY = "NPM: @babel/helper-function-name"
DESCRIPTION = "Helper function to change the property 'name' of every function"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-function-name"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-get-function-arity-native \
           npm-babel-template-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-function-name/-/helper-function-name-7.16.0.tgz"
SRC_URI[md5sum] = "ca7d996cb010cadffd6a1f70d9d1e8e9"
SRC_URI[sha256sum] = "9cd7d0fe3e1bf2589df080796c6fb52536d0c927e50f15f399487daf48e659d0"

NPM_PKGNAME = "@babel/helper-function-name"

inherit npmhelper
inherit native
