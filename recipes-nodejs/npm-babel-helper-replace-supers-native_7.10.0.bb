SUMMARY = "NPM: @babel/helper-replace-supers"
DESCRIPTION = "Helper function to replace supers"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-member-expression-to-functions-native \
           npm-babel-helper-optimise-call-expression-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-replace-supers/-/helper-replace-supers-7.10.0.tgz"
SRC_URI[md5sum] = "c1c9bb455d20fa64c4e51f9a9b901f21"
SRC_URI[sha256sum] = "1f9e789f64898ce6ce845e7a78344c02c2b03a2a18a03a52ecb27257ebfcc475"

NPM_PKGNAME = "@babel/helper-replace-supers"

inherit npmhelper
inherit native
