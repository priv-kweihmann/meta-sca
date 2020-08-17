SUMMARY = "NPM: lodash"
DESCRIPTION = "Lodash modular utilities."
HOMEPAGE = "https://lodash.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8e2fca844c70b3833d7228885447c026"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lodash/-/lodash-4.17.20.tgz"
SRC_URI[md5sum] = "60078ec6d9e76b89fb55c860832742b2"
SRC_URI[sha256sum] = "d2aa8c6afc3c8591765785a37d1c5acae482a8eb3ab9729ed28922692454f2e2"

NPM_PKGNAME = "lodash"

inherit npmhelper
inherit native
