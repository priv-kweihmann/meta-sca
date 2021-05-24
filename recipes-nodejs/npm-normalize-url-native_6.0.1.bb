SUMMARY = "NPM: normalize-url"
DESCRIPTION = "Normalize a URL"
HOMEPAGE = "https://github.com/sindresorhus/normalize-url#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/normalize-url/-/normalize-url-6.0.1.tgz"
SRC_URI[md5sum] = "e5a1ecedd1c7302d2ec75a770b460529"
SRC_URI[sha256sum] = "f798d8fb6ede84c1913ab979205c735bb6edac33f0afe4fb7598d83e680d175c"

NPM_PKGNAME = "normalize-url"

inherit npmhelper
inherit native
