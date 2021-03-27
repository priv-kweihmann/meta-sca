SUMMARY = "NPM: regenerator-runtime"
DESCRIPTION = "Runtime for Regenerator-compiled generator and async functions."
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=57a79768a3b1e4d0f3a3787048a96356"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/regenerator-runtime/-/regenerator-runtime-0.13.8.tgz"
SRC_URI[md5sum] = "00911e4f90f3cfc7008e09ca0cde4c0a"
SRC_URI[sha256sum] = "40db995183c516590abbbf001df54e7fa3990eaf3c87bb4f9c58568ad8c45b87"

NPM_PKGNAME = "regenerator-runtime"

inherit npmhelper
inherit native
