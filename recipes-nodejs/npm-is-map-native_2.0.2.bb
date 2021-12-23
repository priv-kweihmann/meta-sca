SUMMARY = "NPM: is-map"
DESCRIPTION = "Is this value a JS Map? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-map#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c18cc44449ec61c93b216bf74e6c4fa4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-map/-/is-map-2.0.2.tgz"
SRC_URI[md5sum] = "60c2a4044f2d1f879151a1198c3b24fd"
SRC_URI[sha256sum] = "766029ac15d84d6d02096a57fa3ed93ba416245e04e0ebd04e06a86f1d831670"

NPM_PKGNAME = "is-map"

inherit npmhelper
inherit native
