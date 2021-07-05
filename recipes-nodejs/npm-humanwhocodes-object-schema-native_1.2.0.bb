SUMMARY = "NPM: @humanwhocodes/object-schema"
DESCRIPTION = "An object schema merger/validator"
HOMEPAGE = "https://github.com/humanwhocodes/object-schema#readme"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3344c71e5e1f339b11038bec8a90bc4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@humanwhocodes/object-schema/-/object-schema-1.2.0.tgz"
SRC_URI[md5sum] = "3bafe6d6132509797887ee573b2fcd51"
SRC_URI[sha256sum] = "cc2ddbebcf159583d616fc6356b2435abeccd728136e470c260dab8a171a5311"

NPM_PKGNAME = "@humanwhocodes/object-schema"

inherit npmhelper
inherit native
