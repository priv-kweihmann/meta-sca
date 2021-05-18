SUMMARY = "NPM: @babel/helper-replace-supers"
DESCRIPTION = "Helper function to replace supers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-replace-supers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-member-expression-to-functions-native \
           npm-babel-helper-optimise-call-expression-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-replace-supers/-/helper-replace-supers-7.14.3.tgz"
SRC_URI[md5sum] = "14a0b010ec77b699a720634286e6cd9f"
SRC_URI[sha256sum] = "a5218d5e5873c9e4737a491bda0539113515511fae686f7890165e50f91c7d20"

NPM_PKGNAME = "@babel/helper-replace-supers"

inherit npmhelper
inherit native
