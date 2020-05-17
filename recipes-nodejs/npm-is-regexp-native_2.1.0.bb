SUMMARY = "NPM: is-regexp"
DESCRIPTION = "Check if a value is a regular expression"
HOMEPAGE = "https://github.com/sindresorhus/is-regexp#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/is-regexp/-/is-regexp-2.1.0.tgz"
SRC_URI[md5sum] = "012c36582091dbd4bfd4cfa3693f4893"
SRC_URI[sha256sum] = "bd2400706b547939e103b71b22043fb1ab134bbc05f5d35bada85ec3856d95bf"

NPM_PKGNAME = "is-regexp"

inherit npmhelper
inherit native
