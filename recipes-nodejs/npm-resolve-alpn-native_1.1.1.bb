SUMMARY = "NPM: resolve-alpn"
DESCRIPTION = "Detects the ALPN protocol"
HOMEPAGE = "https://github.com/szmarczak/resolve-alpn#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3d086f7c83cdc609b9f5d6057d7c1e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/resolve-alpn/-/resolve-alpn-1.1.1.tgz"
SRC_URI[md5sum] = "a182b1054a02aed66930dfe036cda385"
SRC_URI[sha256sum] = "151d098d8c0e34fe26cb1d6acbc7b82a2c2dc28e90357b3e9fca2d415ab11c84"

NPM_PKGNAME = "resolve-alpn"

inherit npmhelper
inherit native
