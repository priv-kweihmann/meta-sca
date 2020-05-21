SUMMARY = "NPM: p-is-promise"
DESCRIPTION = "Check if something is a promise"
HOMEPAGE = "https://github.com/sindresorhus/p-is-promise#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/p-is-promise/-/p-is-promise-3.0.0.tgz"
SRC_URI[md5sum] = "e38a575266d47d94a72ff5f14113fbe9"
SRC_URI[sha256sum] = "88445f737070d43aab0334d6da611e5d68cc7f6db95010c18c3085a167b6b326"

NPM_PKGNAME = "p-is-promise"

inherit npmhelper
inherit native
