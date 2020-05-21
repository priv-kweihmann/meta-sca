SUMMARY = "NPM: to-readable-stream"
DESCRIPTION = "Convert a string/Buffer/Uint8Array to a readable stream"
HOMEPAGE = "https://github.com/sindresorhus/to-readable-stream#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/to-readable-stream/-/to-readable-stream-2.1.0.tgz"
SRC_URI[md5sum] = "b9f257c4f09d1c40fa3f243601ba2e4d"
SRC_URI[sha256sum] = "cbec74df97e479fe6ab43d2ed3256d2dda58ca7a7a90e48b740b95ff8996f4cd"

NPM_PKGNAME = "to-readable-stream"

inherit npmhelper
inherit native
