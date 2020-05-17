SUMMARY = "NPM: contains-path"
DESCRIPTION = "Return true if a file path contains the given path."
HOMEPAGE = "https://github.com/jonschlinkert/contains-path"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e060235353cb686ae1695ec7db63cfbc"

SRC_URI = "https://registry.npmjs.org/contains-path/-/contains-path-0.1.0.tgz"
SRC_URI[md5sum] = "21d51289f9b59826bac0b90be9ec75b5"
SRC_URI[sha256sum] = "8b0c08e2a2f7f37b4740ce143d11ebc625674766f700aaf14c1c428fa90d7370"

NPM_PKGNAME = "contains-path"

inherit npmhelper
inherit native
