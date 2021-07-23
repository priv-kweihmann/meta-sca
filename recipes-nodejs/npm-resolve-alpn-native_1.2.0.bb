SUMMARY = "NPM: resolve-alpn"
DESCRIPTION = "Detects the ALPN protocol"
HOMEPAGE = "https://github.com/szmarczak/resolve-alpn#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3d086f7c83cdc609b9f5d6057d7c1e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/resolve-alpn/-/resolve-alpn-1.2.0.tgz"
SRC_URI[md5sum] = "a9bd0b6375fc58685d01a6692dc7df76"
SRC_URI[sha256sum] = "7f9c035d2ce78a469c71b9b0e35250164402543b18f4489489dd37493f566e74"

NPM_PKGNAME = "resolve-alpn"

inherit npmhelper
inherit native
