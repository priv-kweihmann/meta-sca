SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.14.2.tgz"
SRC_URI[md5sum] = "973c37dfa68d055cd308cc2ad6bcc513"
SRC_URI[sha256sum] = "f875d73b40f9c5ef7d46fd0d0fb173627c46a3d4216688356b0e5e642bd7196b"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
