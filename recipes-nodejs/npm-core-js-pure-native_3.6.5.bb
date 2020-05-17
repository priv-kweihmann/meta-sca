SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=04ddc8a943888569f9012c4a420f4b09"

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.6.5.tgz"
SRC_URI[md5sum] = "31445c32bbe80971280f38e487fb5411"
SRC_URI[sha256sum] = "fb3452dfe524005326d301c864943d77ea6400d9e67dc15e531c11af5328f4c1"

S = "${WORKDIR}/package"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
