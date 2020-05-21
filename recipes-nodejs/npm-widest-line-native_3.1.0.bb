SUMMARY = "NPM: widest-line"
DESCRIPTION = "Get the visual width of the widest line in a string - the number of columns required to display it"
HOMEPAGE = "https://github.com/sindresorhus/widest-line#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-string-width-native"

SRC_URI = "https://registry.npmjs.org/widest-line/-/widest-line-3.1.0.tgz"
SRC_URI[md5sum] = "c959f5655ef91ef90579bc8f3307f12a"
SRC_URI[sha256sum] = "e910564f223c97a0e6273ff2bfceaad9f53ea2e26d96927cd2dede48173dc95b"

NPM_PKGNAME = "widest-line"

inherit npmhelper
inherit native
