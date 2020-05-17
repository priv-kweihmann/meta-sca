SUMMARY = "NPM: os-tmpdir"
DESCRIPTION = "Node.js os.tmpdir() ponyfill"
HOMEPAGE = "https://github.com/sindresorhus/os-tmpdir#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/os-tmpdir/-/os-tmpdir-1.0.2.tgz"
SRC_URI[md5sum] = "0d1f764536aad6dd6f07e48db889051c"
SRC_URI[sha256sum] = "13e722c2d777c084983e2e1e1150a496aa25685791a71244e61a605ec892ad89"

NPM_PKGNAME = "os-tmpdir"

inherit npmhelper
inherit native
