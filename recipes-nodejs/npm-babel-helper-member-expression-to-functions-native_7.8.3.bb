SUMMARY = "NPM: @babel/helper-member-expression-to-functions"
DESCRIPTION = "Helper function to replace certain member expressions with function calls"
DEPENDS = "npm-babel-types-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

SRC_URI = "https://registry.npmjs.org/@babel/helper-member-expression-to-functions/-/helper-member-expression-to-functions-7.8.3.tgz"
SRC_URI[md5sum] = "b1e8a7caeb2bb7596aea4c0c6a663240"
SRC_URI[sha256sum] = "8c26936b537e339ffc52ac64dbfcf878bb2a73159aa5f7aa545e4e27e1c936c9"

NPM_PKGNAME = "@babel/helper-member-expression-to-functions"

inherit npmhelper
inherit native
