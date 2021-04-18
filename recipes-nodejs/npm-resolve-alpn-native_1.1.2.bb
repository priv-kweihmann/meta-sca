SUMMARY = "NPM: resolve-alpn"
DESCRIPTION = "Detects the ALPN protocol"
HOMEPAGE = "https://github.com/szmarczak/resolve-alpn#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3d086f7c83cdc609b9f5d6057d7c1e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/resolve-alpn/-/resolve-alpn-1.1.2.tgz"
SRC_URI[md5sum] = "ed573a6a033a880d0c745c6d80b1280f"
SRC_URI[sha256sum] = "6cf7dd498352e1d4c1b12d023cb756758cd108d3410809ec7225f80bbea2e8fe"

NPM_PKGNAME = "resolve-alpn"

inherit npmhelper
inherit native
