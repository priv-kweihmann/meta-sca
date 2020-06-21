SUMMARY = "NPM: @types/json5"
DESCRIPTION = "TypeScript definitions for JSON5"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b98fddd052bb2f5ddbcdbd417ffb26a8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/json5/-/json5-0.0.30.tgz"
SRC_URI[md5sum] = "69f1052ed6ad125e924825b5eb6ef550"
SRC_URI[sha256sum] = "5e12a0df3a6ab35c769ad93aac4b3272c7a616848f25cdd2689b88311558a930"

NPM_PKGNAME = "@types/json5"

inherit npmhelper
inherit native

S = "${WORKDIR}/json5"
