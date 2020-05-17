SUMMARY = "NPM: lower-case"
DESCRIPTION = "Transforms the string to lower case"
HOMEPAGE = "https://github.com/blakeembrey/change-case/tree/master/packages/lower-case#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=44088ba57cb871a58add36ce51b8de08"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/lower-case/-/lower-case-2.0.1.tgz"
SRC_URI[md5sum] = "da56f34e725a6f00dfde8b807f5d7417"
SRC_URI[sha256sum] = "e6ba7a95a8c47d3aa63422d7ceb881dbe73f55122ac59846c0f0bac05d08bd1f"

NPM_PKGNAME = "lower-case"

inherit npmhelper
inherit native
