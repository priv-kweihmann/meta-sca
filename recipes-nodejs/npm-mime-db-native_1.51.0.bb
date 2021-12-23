SUMMARY = "NPM: mime-db"
DESCRIPTION = "Media Type Database"
HOMEPAGE = "https://github.com/jshttp/mime-db#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mime-db/-/mime-db-1.51.0.tgz"
SRC_URI[md5sum] = "593bc0def8342b4d742b0828675afb88"
SRC_URI[sha256sum] = "b76e11883ef7c0835c9229a9812a03f3da6ed5c5b72f1eebdc10e982e883a7bf"

NPM_PKGNAME = "mime-db"

inherit npmhelper
inherit native
