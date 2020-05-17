SUMMARY = "NPM: to-vfile"
DESCRIPTION = "Create a vfile from a file-path"
HOMEPAGE = "https://github.com/vfile/to-vfile#readme"

DEPENDS = "npm-is-buffer-native npm-vfile-native npm-x-is-function-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=91fb5297439b32d9cd49df8a2484d3eb"

SRC_URI = "https://registry.npmjs.org/to-vfile/-/to-vfile-2.2.0.tgz"
SRC_URI[md5sum] = "e34a70190a5e557d49bcec1c3b6baa69"
SRC_URI[sha256sum] = "adbfee8a1e906200010bb4682072406151ac6e891abad8051e2b9f3ad33d0439"

NPM_PKGNAME = "to-vfile"

inherit npmhelper
inherit native
