SUMMARY = "NPM: vfile-find-up"
DESCRIPTION = "Find files by searching the file system upwards"
HOMEPAGE = "https://github.com/vfile/vfile-find-up#readme"

DEPENDS = "npm-to-vfile-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=91fb5297439b32d9cd49df8a2484d3eb"

SRC_URI = "https://registry.npmjs.org/vfile-find-up/-/vfile-find-up-2.0.2.tgz"
SRC_URI[md5sum] = "e7f8604ba9642120de95f29ada35ea27"
SRC_URI[sha256sum] = "9e02aca2ec612f0a228fa98a5b50345f29517b59776c5cf2cb5359711f3373c3"

NPM_PKGNAME = "vfile-find-up"

inherit npmhelper
inherit native
