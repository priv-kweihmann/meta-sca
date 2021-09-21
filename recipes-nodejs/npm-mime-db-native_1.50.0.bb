SUMMARY = "NPM: mime-db"
DESCRIPTION = "Media Type Database"
HOMEPAGE = "https://github.com/jshttp/mime-db#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mime-db/-/mime-db-1.50.0.tgz"
SRC_URI[md5sum] = "9945cd71ee97b2d2d458b2e750b48816"
SRC_URI[sha256sum] = "5625e30385fed4a50f92de4346e1f05db0a40479ae6cb5813373353eaeba1da0"

NPM_PKGNAME = "mime-db"

inherit npmhelper
inherit native
