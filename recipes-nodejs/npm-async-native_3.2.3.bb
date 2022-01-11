SUMMARY = "NPM: async"
DESCRIPTION = "Higher-order functions and common patterns for asynchronous code"
HOMEPAGE = "https://caolan.github.io/async/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73f63c1fa4541b2f2f34d77140ebe89d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/async/-/async-3.2.3.tgz"
SRC_URI[md5sum] = "9fa74bdac933e03f4bb1cfc92b713b10"
SRC_URI[sha256sum] = "df448f7fbfbb699f5d8e18dbfb1e24746941c9b1323f6a5a0f874d5ab33981fc"

NPM_PKGNAME = "async"

inherit npmhelper
inherit native
