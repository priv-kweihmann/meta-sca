SUMMARY = "NPM: object.fromentries"
DESCRIPTION = "ES proposal-spec-compliant Object.fromEntries shim."
HOMEPAGE = "https://github.com/es-shims/Object.fromEntries#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=291be6f19f64188a89ffd5180aea06f7"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native \
           npm-has-native"

SRC_URI = "https://registry.npmjs.org/object.fromentries/-/object.fromentries-2.0.3.tgz"
SRC_URI[md5sum] = "a5ce070d3937547d1f4148dc50094c9b"
SRC_URI[sha256sum] = "1214fbdd5ef78b6af40655bdf08f9f47f6b8a9769f90c2fcd2bccc99b5627d4e"

NPM_PKGNAME = "object.fromentries"

inherit npmhelper
inherit native
