SUMMARY = "NPM: duplexer"
DESCRIPTION = "Creates a duplex stream"
HOMEPAGE = "https://github.com/Raynos/duplexer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE;md5=8966d3100f2d871ee216d056c0ea0160"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/duplexer/-/duplexer-0.1.2.tgz"
SRC_URI[md5sum] = "355f34b5c60227df03e4c55b99b6ce56"
SRC_URI[sha256sum] = "aa316a606a4a0af1978d5c6bfcb1f942a819418892848d3672b448e0c10f463d"

NPM_PKGNAME = "duplexer"

inherit npmhelper
inherit native
