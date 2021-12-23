SUMMARY = "NPM: regenerator-runtime"
DESCRIPTION = "Runtime for Regenerator-compiled generator and async functions."
HOMEPAGE = "{homepage}"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=57a79768a3b1e4d0f3a3787048a96356"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/regenerator-runtime/-/regenerator-runtime-0.13.9.tgz"
SRC_URI[md5sum] = "c9b2e424a39fbe8c42da6e1234ae582d"
SRC_URI[sha256sum] = "1a6b5437215dc6558817acfd9f8300f5519475ddc8f9f55bec243c622fd099b8"

NPM_PKGNAME = "regenerator-runtime"

inherit npmhelper
inherit native
