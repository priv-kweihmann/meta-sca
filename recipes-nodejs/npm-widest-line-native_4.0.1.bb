SUMMARY = "NPM: widest-line"
DESCRIPTION = "Get the visual width of the widest line in a string - the number of columns required to display it"
HOMEPAGE = "https://github.com/sindresorhus/widest-line#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-string-width-native"

SRC_URI = "https://registry.npmjs.org/widest-line/-/widest-line-4.0.1.tgz"
SRC_URI[md5sum] = "21201b33d072003d3ed887b9983bb6bf"
SRC_URI[sha256sum] = "a19e9678283268e32d4e15b781f0270cc600938493885389c8481c0a7c681133"

NPM_PKGNAME = "widest-line"

inherit npmhelper
inherit native
