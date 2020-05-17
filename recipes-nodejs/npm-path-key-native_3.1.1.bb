SUMMARY = "NPM: path-key"
DESCRIPTION = "Get the PATH environment variable key cross-platform"
HOMEPAGE = "https://github.com/sindresorhus/path-key#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/path-key/-/path-key-3.1.1.tgz"
SRC_URI[md5sum] = "4f4b9beb2d53481341e16133a8570dc5"
SRC_URI[sha256sum] = "4b8999acb914830edcd3c5b8fec632b32c6bc759ac3edc86336f5a9e08ba7b92"

NPM_PKGNAME = "path-key"

inherit npmhelper
inherit native
