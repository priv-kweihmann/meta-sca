SUMMARY = "NPM: to-readable-stream"
DESCRIPTION = "Convert a string/Buffer/Uint8Array to a readable stream"
HOMEPAGE = "https://github.com/sindresorhus/to-readable-stream#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/to-readable-stream/-/to-readable-stream-1.0.0.tgz"
SRC_URI[md5sum] = "b9cb0fe9731dc701d1a44a7a173cb434"
SRC_URI[sha256sum] = "601885533285aea8adb4d20bc165e7f7373e6281a540759e898e009cafc5e2db"

NPM_PKGNAME = "to-readable-stream"

inherit npmhelper
inherit native
