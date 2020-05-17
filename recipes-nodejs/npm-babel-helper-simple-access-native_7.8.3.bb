SUMMARY = "NPM: @babel/helper-simple-access"
DESCRIPTION = "Babel helper for ensuring that access to a given value is performed through simple accesses"
HOMEPAGE = "https://babeljs.io/"

DEPENDS = "npm-babel-template-native npm-babel-types-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

SRC_URI = "https://registry.npmjs.org/@babel/helper-simple-access/-/helper-simple-access-7.8.3.tgz"
SRC_URI[md5sum] = "947719c24af636a663302c20395dce8f"
SRC_URI[sha256sum] = "9319025e04b79f376ee896211e5ed80eb562dd5ce4cca813bbfd55250a9b1b7a"

NPM_PKGNAME = "@babel/helper-simple-access"

inherit npmhelper
inherit native
