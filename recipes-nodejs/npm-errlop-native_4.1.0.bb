SUMMARY = "NPM: errlop"
DESCRIPTION = "An extended Error class that envelops a parent error, such that the stack trace contains the causation"
HOMEPAGE = "https://github.com/bevry/errlop"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=6506c7bda93e9f5b398bf22fa4c0ce00"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/errlop/-/errlop-4.1.0.tgz"
SRC_URI[md5sum] = "a78570643e7e38f38a890c842d1df137"
SRC_URI[sha256sum] = "504cd56974f7a21f4197a52c4b39c73db45a167082fdd3d9661b6ffaa7993c02"

NPM_PKGNAME = "errlop"

inherit npmhelper
inherit native
