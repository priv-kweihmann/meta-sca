SUMMARY = "NPM: split-lines"
DESCRIPTION = "Split lines into an array of lines"
HOMEPAGE = "https://github.com/sindresorhus/split-lines#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/split-lines/-/split-lines-2.0.0.tgz"
SRC_URI[md5sum] = "7dd6176425cd9662c9d58258c7d504ab"
SRC_URI[sha256sum] = "c4975e8bf4e0042e5e8cdba4a1bb0c142862376252a7cee6184df91e49d47c71"

NPM_PKGNAME = "split-lines"

inherit npmhelper
inherit native
