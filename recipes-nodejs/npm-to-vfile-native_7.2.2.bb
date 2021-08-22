SUMMARY = "NPM: to-vfile"
DESCRIPTION = "vfile utility to create a vfile from a filepath"
HOMEPAGE = "https://github.com/vfile/to-vfile#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-is-buffer-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/to-vfile/-/to-vfile-7.2.2.tgz"
SRC_URI[md5sum] = "f0aebca0a569860bf14bd1ed308ca890"
SRC_URI[sha256sum] = "2fab5315cb849f999d00c7a02447fe8e4cd7a42cfd6404d3c385061085bd93d4"

NPM_PKGNAME = "to-vfile"

inherit npmhelper
inherit native
