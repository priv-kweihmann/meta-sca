SUMMARY = "NPM: @babel/helper-replace-supers"
DESCRIPTION = "Helper function to replace supers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-replace-supers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-member-expression-to-functions-native \
           npm-babel-helper-optimise-call-expression-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-replace-supers/-/helper-replace-supers-7.14.4.tgz"
SRC_URI[md5sum] = "b97bd6728230415f10f8f21c7ea49d23"
SRC_URI[sha256sum] = "50a80a199a863901f9f31314bc4834daec8776ba2d8e5c7e75a1f42780d073ef"

NPM_PKGNAME = "@babel/helper-replace-supers"

inherit npmhelper
inherit native
