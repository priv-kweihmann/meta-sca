SUMMARY = "NPM: mime-db"
DESCRIPTION = "Media Type Database"
HOMEPAGE = "https://github.com/jshttp/mime-db#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mime-db/-/mime-db-1.46.0.tgz"
SRC_URI[md5sum] = "52a4db64b57a3ca9ae81bb5a00f4fc5c"
SRC_URI[sha256sum] = "c90519cc380537ab405bbf9d7f481be3c32fb4d88803ad4ebcba694f7c8a9e7c"

NPM_PKGNAME = "mime-db"

inherit npmhelper
inherit native
