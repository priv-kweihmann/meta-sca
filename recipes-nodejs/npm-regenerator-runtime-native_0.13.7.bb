SUMMARY = "NPM: regenerator-runtime"
DESCRIPTION = "Runtime for Regenerator-compiled generator and async functions."
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=57a79768a3b1e4d0f3a3787048a96356"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/regenerator-runtime/-/regenerator-runtime-0.13.7.tgz"
SRC_URI[md5sum] = "213cc9e1ebf4dd06bd9bbd733d1e9785"
SRC_URI[sha256sum] = "b5cd4cf6502afafd8464fe159b1af0d8db0301d71952de4a54d00394f7d2a14e"

NPM_PKGNAME = "regenerator-runtime"

inherit npmhelper
inherit native
