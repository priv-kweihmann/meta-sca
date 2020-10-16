SUMMARY = "NPM: @babel/helper-member-expression-to-functions"
DESCRIPTION = "Helper function to replace certain member expressions with function calls"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-member-expression-to-functions/-/helper-member-expression-to-functions-7.12.1.tgz"
SRC_URI[md5sum] = "57ab7b60ea7e0b0bc4457b0e4a066e87"
SRC_URI[sha256sum] = "c7a2ff0d1d290c702fbd7016b094ba1e8460dcff6e1f57e8d9de19deaae1a673"

NPM_PKGNAME = "@babel/helper-member-expression-to-functions"

inherit npmhelper
inherit native
