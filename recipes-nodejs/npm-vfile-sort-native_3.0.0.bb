SUMMARY = "NPM: vfile-sort"
DESCRIPTION = "vfile utility to sort messages by line/column"
HOMEPAGE = "https://github.com/vfile/vfile-sort#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-vfile-message-native"

SRC_URI = "https://registry.npmjs.org/vfile-sort/-/vfile-sort-3.0.0.tgz"
SRC_URI[md5sum] = "a24135314a157579c6457e46a9a89555"
SRC_URI[sha256sum] = "40179e53a4f3e0ca642456e6b5b2ef6d0d635513d99352288fe9467d9b044238"

NPM_PKGNAME = "vfile-sort"

inherit npmhelper
inherit native
