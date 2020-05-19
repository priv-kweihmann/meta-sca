SUMMARY = "NPM: @types/structured-source"
DESCRIPTION = "TypeScript definitions for structured-source"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b98fddd052bb2f5ddbcdbd417ffb26a8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/structured-source/-/structured-source-3.0.0.tgz"
SRC_URI[md5sum] = "4fe6063a1ba31476782c9e35fc268406"
SRC_URI[sha256sum] = "5996ad39586a28d36cafdc9ddf52363e348c8583355c4c92b125156ac257917c"

NPM_PKGNAME = "@types/structured-source"

inherit npmhelper
inherit native

S = "${WORKDIR}/structured-source"
