SUMMARY = "NPM: nanocolors"
DESCRIPTION = "4x times faster than chalk and use 5x less space in node_modules"
HOMEPAGE = "https://github.com/ai/nanocolors#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8a4e3045ea9fd406a9473409b5c4c316"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanocolors/-/nanocolors-0.2.9.tgz"
SRC_URI[md5sum] = "ff8c0e690bf2215fa4c713769a7aebdf"
SRC_URI[sha256sum] = "ed1b1814a7c016aa11175cad66ac68ebe24752f884751816755d18ba79a7b853"

NPM_PKGNAME = "nanocolors"

inherit npmhelper
inherit native
