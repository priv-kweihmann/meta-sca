SUMMARY = "NPM: vfile-sort"
DESCRIPTION = "vfile utility to sort messages by line/column"
HOMEPAGE = "https://github.com/vfile/vfile-sort#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

SRC_URI = "https://registry.npmjs.org/vfile-sort/-/vfile-sort-2.2.2.tgz"
SRC_URI[md5sum] = "611bf645a37a479289f1213dc17c0093"
SRC_URI[sha256sum] = "89f0a3e9daca768e694286a297c18a37cbc3abf0a4d0949abcba7a32c2cef58b"

NPM_PKGNAME = "vfile-sort"

inherit npmhelper
inherit native
