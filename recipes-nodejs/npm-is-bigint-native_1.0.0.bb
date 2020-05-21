SUMMARY = "NPM: is-bigint"
DESCRIPTION = "Is this value an ES BigInt?"
HOMEPAGE = "https://github.com/ljharb/is-bigint#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=291be6f19f64188a89ffd5180aea06f7"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-bigint/-/is-bigint-1.0.0.tgz"
SRC_URI[md5sum] = "f264c9e0558417d5724f7a7c08e60cf2"
SRC_URI[sha256sum] = "822cd37629d2a7b472c4b7ab641736fbc0200fad5e2a3f388bc49ea0951adc49"

NPM_PKGNAME = "is-bigint"

inherit npmhelper
inherit native
