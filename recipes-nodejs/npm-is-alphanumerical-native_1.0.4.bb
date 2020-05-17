SUMMARY = "NPM: is-alphanumerical"
DESCRIPTION = "Check if a character is alphanumerical"
HOMEPAGE = "https://github.com/wooorm/is-alphanumerical#readme"

DEPENDS = "npm-is-alphabetical-native npm-is-decimal-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/is-alphanumerical/-/is-alphanumerical-1.0.4.tgz"
SRC_URI[md5sum] = "24c92e9b8762a33da4c8822eef45067f"
SRC_URI[sha256sum] = "c42c5703e1343ea836f85ee7629eb679f0329496874f5fedb38a2955b3d11b6b"

NPM_PKGNAME = "is-alphanumerical"

inherit npmhelper
inherit native
