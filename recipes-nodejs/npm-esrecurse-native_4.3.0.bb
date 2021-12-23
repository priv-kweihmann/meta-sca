SUMMARY = "NPM: esrecurse"
DESCRIPTION = "ECMAScript AST recursive visitor"
HOMEPAGE = "https://github.com/estools/esrecurse"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://README.md;beginline=149;md5=38eeb2ba26f714e95547013f8d87242c"

DEPENDS = "npm-estraverse-native"

SRC_URI = "https://registry.npmjs.org/esrecurse/-/esrecurse-4.3.0.tgz"
SRC_URI[md5sum] = "a39f104614e3543dd4522ac4afdace00"
SRC_URI[sha256sum] = "3ecf9370d7296b47b570c88a11f70b35bb965af8d536536b259eb55f9b793b61"

NPM_PKGNAME = "esrecurse"

inherit npmhelper
inherit native
