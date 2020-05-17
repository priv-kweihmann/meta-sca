SUMMARY = "NPM: duplexer"
DESCRIPTION = "Creates a duplex stream"
HOMEPAGE = "https://github.com/Raynos/duplexer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE;md5=8966d3100f2d871ee216d056c0ea0160"

SRC_URI = "https://registry.npmjs.org/duplexer/-/duplexer-0.1.1.tgz"
SRC_URI[md5sum] = "c8a7d16d4295c1fbc6757141ddd24154"
SRC_URI[sha256sum] = "e970de93b55944f514569a97b5d134163db45fee7814315ff4ce9fa2f0a6312e"

NPM_PKGNAME = "duplexer"

inherit npmhelper
inherit native
