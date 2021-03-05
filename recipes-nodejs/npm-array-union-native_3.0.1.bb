SUMMARY = "NPM: array-union"
DESCRIPTION = "Create an array of unique values, in order, from the input arrays"
HOMEPAGE = "https://github.com/sindresorhus/array-union#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/array-union/-/array-union-3.0.1.tgz"
SRC_URI[md5sum] = "b2cbc98fa4b6fdb13ab0b2156bed3e7a"
SRC_URI[sha256sum] = "918cd3b1889e52960cc02f1ceab926b9cef3145754ca19c8274ff5561c9a3a92"

NPM_PKGNAME = "array-union"

inherit npmhelper
inherit native
