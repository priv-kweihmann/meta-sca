SUMMARY = "NPM: mime-db"
DESCRIPTION = "Media Type Database"
HOMEPAGE = "https://github.com/jshttp/mime-db#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mime-db/-/mime-db-1.47.0.tgz"
SRC_URI[md5sum] = "839ae18727a00c7f2a71c4ce91370948"
SRC_URI[sha256sum] = "d1b4494ebb3fce2210fce57da10ec7859ef46316ce89334295a4d2cc89e36dfd"

NPM_PKGNAME = "mime-db"

inherit npmhelper
inherit native
