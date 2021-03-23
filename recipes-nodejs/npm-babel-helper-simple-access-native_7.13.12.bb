SUMMARY = "NPM: @babel/helper-simple-access"
DESCRIPTION = "Babel helper for ensuring that access to a given value is performed through simple accesses"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-simple-access"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-simple-access/-/helper-simple-access-7.13.12.tgz"
SRC_URI[md5sum] = "54b6013cf769a72c8469bedcd0eeae6e"
SRC_URI[sha256sum] = "4ece7525682a282a57fa42ab7572356640d329a52ca3b7c0511cc3ef097607ff"

NPM_PKGNAME = "@babel/helper-simple-access"

inherit npmhelper
inherit native
