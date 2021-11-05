SUMMARY = "NPM: is-alphanumerical"
DESCRIPTION = "Check if a character is alphanumerical"
HOMEPAGE = "https://github.com/wooorm/is-alphanumerical#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-is-alphabetical-native \
           npm-is-decimal-native"

SRC_URI = "https://registry.npmjs.org/is-alphanumerical/-/is-alphanumerical-2.0.1.tgz"
SRC_URI[md5sum] = "ebd5fcb299be324342b52085e448c7d7"
SRC_URI[sha256sum] = "b6f98de1bfab7ed76025357018b57593bacd2d177985cd04bbd2a5059d3ea92b"

NPM_PKGNAME = "is-alphanumerical"

inherit npmhelper
inherit native
