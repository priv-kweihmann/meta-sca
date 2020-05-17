SUMMARY = "NPM: es6-promise"
DESCRIPTION = "A lightweight library that provides tools for organizing asynchronous code"
HOMEPAGE = "https://github.com/stefanpenner/es6-promise"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6e73e44544d76c1978a076a8292d031a"

SRC_URI = "https://registry.npmjs.org/es6-promise/-/es6-promise-4.2.8.tgz"
SRC_URI[md5sum] = "fabc0925fba0c42a2fa8c6574b4bf829"
SRC_URI[sha256sum] = "ea3adc416f8327d7b505df5585b4418d454cc295d25d9cd402bd0c10d89866a7"

NPM_PKGNAME = "es6-promise"

inherit npmhelper
inherit native
