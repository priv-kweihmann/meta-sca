SUMMARY = "NPM: p-defer"
DESCRIPTION = "Create a deferred promise"
HOMEPAGE = "https://github.com/sindresorhus/p-defer#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/p-defer/-/p-defer-3.0.0.tgz"
SRC_URI[md5sum] = "7305f1f61655fa0264ff52f6b373666b"
SRC_URI[sha256sum] = "907730a7b0641a09ccf93aa39db48724ec1e44888b6bbf3e28e98e628d238e8a"

NPM_PKGNAME = "p-defer"

inherit npmhelper
inherit native
