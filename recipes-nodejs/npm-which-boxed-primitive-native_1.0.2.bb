SUMMARY = "NPM: which-boxed-primitive"
DESCRIPTION = "Which kind of boxed JS primitive is this?"
HOMEPAGE = "https://github.com/inspect-js/which-boxed-primitive#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=375dc7ca936a14e9c29418d5263bd066"

DEPENDS = "npm-is-bigint-native \
           npm-is-boolean-object-native \
           npm-is-number-object-native \
           npm-is-string-native \
           npm-is-symbol-native"

SRC_URI = "https://registry.npmjs.org/which-boxed-primitive/-/which-boxed-primitive-1.0.2.tgz"
SRC_URI[md5sum] = "2d84f8bed229309416dffff93d5028cd"
SRC_URI[sha256sum] = "4a4017ba9103fed80bc3ec67c529ed43b38066a626dd9595d91a57cf0c5e089d"

NPM_PKGNAME = "which-boxed-primitive"

inherit npmhelper
inherit native
