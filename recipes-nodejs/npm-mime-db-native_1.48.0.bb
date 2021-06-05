SUMMARY = "NPM: mime-db"
DESCRIPTION = "Media Type Database"
HOMEPAGE = "https://github.com/jshttp/mime-db#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mime-db/-/mime-db-1.48.0.tgz"
SRC_URI[md5sum] = "c507ad3c4db13cb176c1989c27269405"
SRC_URI[sha256sum] = "f62ed24197888b9faaeda44c9ec6a87575e5248ca7ae47364a8ad747fb1c0dda"

NPM_PKGNAME = "mime-db"

inherit npmhelper
inherit native
