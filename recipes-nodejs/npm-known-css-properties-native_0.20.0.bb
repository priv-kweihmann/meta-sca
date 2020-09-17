SUMMARY = "NPM: known-css-properties"
DESCRIPTION = "List of known CSS properties"
HOMEPAGE = "https://github.com/known-css/known-css-properties#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37549544f16ed84cd09a09af0e78977f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/known-css-properties/-/known-css-properties-0.20.0.tgz"
SRC_URI[md5sum] = "dd9b8709f55806ff8a48a599dc278db9"
SRC_URI[sha256sum] = "c547d03927b6d1668ec8ac91519d3092fb300d719b37dc2fa1231c14c53dc516"

NPM_PKGNAME = "known-css-properties"

inherit npmhelper
inherit native
