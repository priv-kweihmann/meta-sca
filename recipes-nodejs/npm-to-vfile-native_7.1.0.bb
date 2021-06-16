SUMMARY = "NPM: to-vfile"
DESCRIPTION = "vfile utility to create a vfile from a filepath"
HOMEPAGE = "https://github.com/vfile/to-vfile#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-is-buffer-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/to-vfile/-/to-vfile-7.1.0.tgz"
SRC_URI[md5sum] = "50aba9c4e1ddd32528d14abb7d34efd1"
SRC_URI[sha256sum] = "0a2783f67e3033ca37b7222038e2f7eb10e04a8f742c3106eac063b1c6089cc9"

NPM_PKGNAME = "to-vfile"

inherit npmhelper
inherit native
