SUMMARY = "NPM: vfile-find-up"
DESCRIPTION = "vfile utility to find one or more files by searching the file system upwards"
HOMEPAGE = "https://github.com/vfile/vfile-find-up#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-to-vfile-native"

SRC_URI = "https://registry.npmjs.org/vfile-find-up/-/vfile-find-up-5.0.1.tgz"
SRC_URI[md5sum] = "62ac4216d306d27cc0196d86bd287071"
SRC_URI[sha256sum] = "77b1f9928581e86c1efed53dc8874b612bc093316fb53f18b8d0e039680bab25"

NPM_PKGNAME = "vfile-find-up"

inherit npmhelper
inherit native
