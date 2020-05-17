SUMMARY = "NPM: write"
DESCRIPTION = "Write data to a file, replacing the file if it already exists and creating any intermediate directories if they don't already exist. Thin wrapper around node's native fs methods."
HOMEPAGE = "https://github.com/jonschlinkert/write"

DEPENDS = "npm-mkdirp-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2f5638b0557426da0c3bd67e00a0ebde"

SRC_URI = "https://registry.npmjs.org/write/-/write-1.0.3.tgz"
SRC_URI[md5sum] = "13bb744fc2a4140cef350b5f3c13062e"
SRC_URI[sha256sum] = "8970fa014fd07716369b9962b27f17212945d2247759afa98241876dea1518e8"

NPM_PKGNAME = "write"

inherit npmhelper
inherit native
