SUMMARY = "NPM: debug-log"
DESCRIPTION = "Node.js 0.12 util.debuglog() ponyfill"
HOMEPAGE = "https://github.com/sindresorhus/debug-log#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/debug-log/-/debug-log-1.0.1.tgz"
SRC_URI[md5sum] = "e7ba7a43df9f983d975c08451ca7f4ad"
SRC_URI[sha256sum] = "5ce5df47b00f65b6d84df8da4692a421edce014ad9d41fd72539fa103d85e453"

NPM_PKGNAME = "debug-log"

inherit npmhelper
inherit native
