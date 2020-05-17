SUMMARY = "NPM: run-async"
DESCRIPTION = "Utility method to run function either synchronously or asynchronously using the common `this.async()` style."
HOMEPAGE = "https://github.com/SBoudrias/run-async#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a2c64a5ee43edd29ae76900950466998"

SRC_URI = "https://registry.npmjs.org/run-async/-/run-async-2.4.1.tgz"
SRC_URI[md5sum] = "131c6d8b4ec85ac865e08243af030620"
SRC_URI[sha256sum] = "0edc3a9c2e40d553771fab31f746b7609c2981ee2cfdfdbe44c30182b76d8d4f"

NPM_PKGNAME = "run-async"

inherit npmhelper
inherit native
