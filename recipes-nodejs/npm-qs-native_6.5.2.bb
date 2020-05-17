SUMMARY = "NPM: qs"
DESCRIPTION = "A querystring parser that supports nesting and arrays, with a depth limit"
HOMEPAGE = "https://github.com/ljharb/qs"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5c7c6dc45a33a0a9620ed81315672d7"

SRC_URI = "https://registry.npmjs.org/qs/-/qs-6.5.2.tgz"
SRC_URI[md5sum] = "222120eb1146b4919d75bf117b2d380f"
SRC_URI[sha256sum] = "539349384f28c64d970ee897379839967dcc2a9c5b03a4db49cb1c0e5e2e16f0"

S = "${WORKDIR}/package"

NPM_PKGNAME = "qs"

inherit npmhelper
inherit native
