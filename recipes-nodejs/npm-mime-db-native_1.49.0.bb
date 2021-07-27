SUMMARY = "NPM: mime-db"
DESCRIPTION = "Media Type Database"
HOMEPAGE = "https://github.com/jshttp/mime-db#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mime-db/-/mime-db-1.49.0.tgz"
SRC_URI[md5sum] = "fb6464e98dc2c73b0ef8be98436f2f29"
SRC_URI[sha256sum] = "b7314aa913d18e470b922f0abfc1cebe679b36aff9872686051ee8c9ef82a999"

NPM_PKGNAME = "mime-db"

inherit npmhelper
inherit native
