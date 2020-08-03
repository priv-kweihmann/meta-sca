SUMMARY = "NPM: normalize-url"
DESCRIPTION = "Normalize a URL"
HOMEPAGE = "https://github.com/sindresorhus/normalize-url#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/normalize-url/-/normalize-url-5.1.0.tgz"
SRC_URI[md5sum] = "204c47e8017306b979cc5f1b8346ba69"
SRC_URI[sha256sum] = "abe7e189d2827e8d5afdb44416e1e00999b4d77d4c9de73d95ae1b72b574a0c8"

NPM_PKGNAME = "normalize-url"

inherit npmhelper
inherit native
