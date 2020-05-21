SUMMARY = "NPM: resolve-alpn"
DESCRIPTION = "Detects the ALPN protocol"
HOMEPAGE = "https://github.com/szmarczak/resolve-alpn#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3d086f7c83cdc609b9f5d6057d7c1e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/resolve-alpn/-/resolve-alpn-1.0.0.tgz"
SRC_URI[md5sum] = "621a869cf688ea3d86d3dc1b6418a889"
SRC_URI[sha256sum] = "921a1c17a55dfb9c56981d14932bc5aba4cf9b544d52887e5795f6dfbfa82642"

NPM_PKGNAME = "resolve-alpn"

inherit npmhelper
inherit native
