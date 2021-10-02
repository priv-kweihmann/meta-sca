SUMMARY = "NPM: nanocolors"
DESCRIPTION = "4x times faster than chalk and use 5x less space in node_modules"
HOMEPAGE = "https://github.com/ai/nanocolors#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8a4e3045ea9fd406a9473409b5c4c316"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanocolors/-/nanocolors-0.2.12.tgz"
SRC_URI[md5sum] = "9926ffc1617a8278c58c0f90181aa9d7"
SRC_URI[sha256sum] = "e1584248527c3ca3376083900dcd797e0bee75a2388e2238d2f27b3cc27702cc"

NPM_PKGNAME = "nanocolors"

inherit npmhelper
inherit native
