SUMMARY = "NPM: @babel/helper-member-expression-to-functions"
DESCRIPTION = "Helper function to replace certain member expressions with function calls"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-member-expression-to-functions/-/helper-member-expression-to-functions-7.10.4.tgz"
SRC_URI[md5sum] = "0dda26b9ca44a1d1acda816fb0ff0889"
SRC_URI[sha256sum] = "1bc8d9d36aea87ebfcafc7446d41941d63261bc89306bc88a0394bdc02aed15e"

NPM_PKGNAME = "@babel/helper-member-expression-to-functions"

inherit npmhelper
inherit native
