SUMMARY = "NPM: ms"
DESCRIPTION = "Tiny millisecond conversion utility"
HOMEPAGE = "https://github.com/zeit/ms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license.md;md5=fd56fd5f1860961dfa92d313167c37a6"

SRC_URI = "https://registry.npmjs.org/ms/-/ms-2.1.2.tgz"
SRC_URI[md5sum] = "5a8310f20fd4b97c7f8eeaf65f896a7a"
SRC_URI[sha256sum] = "1157a6e30d3ffe1b9fcaf3a39caf159f8dc981199a3380c78ddd89f73bcefb48"

NPM_PKGNAME = "ms"

inherit npmhelper
inherit native
