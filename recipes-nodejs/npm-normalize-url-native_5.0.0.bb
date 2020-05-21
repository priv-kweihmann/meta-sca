SUMMARY = "NPM: normalize-url"
DESCRIPTION = "Normalize a URL"
HOMEPAGE = "https://github.com/sindresorhus/normalize-url#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/normalize-url/-/normalize-url-5.0.0.tgz"
SRC_URI[md5sum] = "b9a5c4cf543088cdd57e7f4361fcd803"
SRC_URI[sha256sum] = "013c6cc59d123612ab74687ab1382b7cc919afb537647890e154b59bd210f6d7"

NPM_PKGNAME = "normalize-url"

inherit npmhelper
inherit native
