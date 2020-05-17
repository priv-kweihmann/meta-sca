SUMMARY = "NPM: path-exists"
DESCRIPTION = "Check if a path exists"
HOMEPAGE = "https://github.com/sindresorhus/path-exists#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/path-exists/-/path-exists-4.0.0.tgz"
SRC_URI[md5sum] = "d3652d47b80b1aa623e820d7d276b27b"
SRC_URI[sha256sum] = "dbb535c9302ce9b3f777ece3ff055cc8d88890a1e1deddc045340aef76fb775c"

NPM_PKGNAME = "path-exists"

inherit npmhelper
inherit native
