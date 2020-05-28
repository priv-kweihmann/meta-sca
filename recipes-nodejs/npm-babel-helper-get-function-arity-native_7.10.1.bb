SUMMARY = "NPM: @babel/helper-get-function-arity"
DESCRIPTION = "Helper function to get function arity"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-get-function-arity/-/helper-get-function-arity-7.10.1.tgz"
SRC_URI[md5sum] = "afac41fe64a482b7757ed373ee2168fa"
SRC_URI[sha256sum] = "d2fcafb8887a2bd5987d5c8d903db43cdfaa10cd13ebd5e92bf645fce4190d04"

NPM_PKGNAME = "@babel/helper-get-function-arity"

inherit npmhelper
inherit native
