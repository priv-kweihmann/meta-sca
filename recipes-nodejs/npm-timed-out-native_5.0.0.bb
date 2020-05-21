SUMMARY = "NPM: timed-out"
DESCRIPTION = "Timeout HTTP/HTTPS requests"
HOMEPAGE = "https://github.com/sindresorhus/timed-out#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=93362fc3fb1cf1e0a942b2fec852af7f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/timed-out/-/timed-out-5.0.0.tgz"
SRC_URI[md5sum] = "0ee1a3bdf4fe9e87a6fd08ee8d3dc448"
SRC_URI[sha256sum] = "8ea716e5e2d978c42bb6480d9930ef08d353c64fe92656c778b03d349679bbf1"

NPM_PKGNAME = "timed-out"

inherit npmhelper
inherit native
