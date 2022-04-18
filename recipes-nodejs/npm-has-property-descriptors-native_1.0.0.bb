SUMMARY = "NPM: has-property-descriptors"
DESCRIPTION = "Does the environment have full property descriptor support? Handles IE 8's broken defineProperty/gOPD."
HOMEPAGE = "https://github.com/inspect-js/has-property-descriptors#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d237eac07663bde2409de740ba75ec97"

DEPENDS = "npm-get-intrinsic-native"

SRC_URI = "https://registry.npmjs.org/has-property-descriptors/-/has-property-descriptors-1.0.0.tgz"
SRC_URI[md5sum] = "7f67f61d09b2f2e9faa560ba49b21e85"
SRC_URI[sha256sum] = "1ea75b75dc4e6f491cb9f736cb49265ada125f8bf23fc43cff6d16c1c6435f97"

NPM_PKGNAME = "has-property-descriptors"

inherit npmhelper
inherit native
